package com.example.royalenfield;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Vector;

public class accessories_bill extends AppCompatActivity
{

    TextView name,price,total;
    final int UPI_PAYMENT = 0;
    Vector<String> pname;
    Vector<Integer> pprice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accessories_bill);
        name=findViewById(R.id.acc_name);
        price=findViewById(R.id.acc_price);
        total=findViewById(R.id.acc_total);
        pname= new Vector<>();
        pprice= new Vector<>();


        name.setText(getIntent().getStringExtra("Name"));
        price.setText(getIntent().getStringExtra("Price"));
        total.setText("Total: "+getIntent().getStringExtra("total"));

        String n =getIntent().getStringExtra("n");
        String p =getIntent().getStringExtra("p");


        StringTokenizer st = new StringTokenizer(n,"^");

        while(st.hasMoreTokens())
        {
            pname.add(st.nextToken());
        }

        StringTokenizer st1 = new StringTokenizer(p,"^");

        while(st1.hasMoreTokens())
        {
            pprice.add(Integer.parseInt(st1.nextToken()));
        }
        SharedPreferences sp = getSharedPreferences("uname",MODE_PRIVATE);
        String s = sp.getString("name","");

        Toast.makeText(this, ""+s, Toast.LENGTH_SHORT).show();


        Accessories_Db db = new Accessories_Db(this);

        Cursor c =db.displayData();
        StringBuilder sb = new StringBuilder();
        while(c.moveToNext())
        {
            sb.append(c.getString(0)+" : "+c.getString(1)+" : "+c.getInt(2)+"\n");
        }

        Toast.makeText(this, sb, Toast.LENGTH_SHORT).show();

    }

    public void payNow(View view)
    {
        EditText amount, note, name, upivirtualid;
        Button send;
        String TAG ="main";
        final int UPI_PAYMENT = 0;

        send = (Button) findViewById(R.id.send);
        amount = (EditText)findViewById(R.id.amount_et);
        note = (EditText)findViewById(R.id.note);
        name = (EditText) findViewById(R.id.name);
        upivirtualid =(EditText) findViewById(R.id.upi_id);

        String totalAmount=total.getText().toString();
        amount.setText(totalAmount);
//        Toast.makeText(this, totalAmount, Toast.LENGTH_SHORT).show();

        if (TextUtils.isEmpty(name.getText().toString().trim())){
            Toast.makeText(this," Name is invalid", Toast.LENGTH_SHORT).show();
        }else if (TextUtils.isEmpty(upivirtualid.getText().toString().trim())){
            Toast.makeText(this," UPI ID is invalid", Toast.LENGTH_SHORT).show();
        }else if (TextUtils.isEmpty(note.getText().toString().trim())){
            Toast.makeText(this," Note is invalid", Toast.LENGTH_SHORT).show();
        }else if (TextUtils.isEmpty(amount.getText().toString().trim())){
            Toast.makeText(this," Amount is invalid", Toast.LENGTH_SHORT).show();
        }else{
            payUsingUpi(name.getText().toString(), upivirtualid.getText().toString(),
                    note.getText().toString(), totalAmount);
        }

    }
    void payUsingUpi(  String name,String upiId, String note, String amount) {
        Log.e("main ", "name "+name +"--up--"+upiId+"--"+ note+"--"+amount);
//        Uri uri = Uri.parse("upi://pay").buildUpon()
//                .appendQueryParameter("pa", upiId)
//                .appendQueryParameter("pn", name)
//                //.appendQueryParameter("mc", "")
//                //.appendQueryParameter("tid", "02125412")
//                //.appendQueryParameter("tr", "25584584")
//                .appendQueryParameter("tn", note)
//                .appendQueryParameter("am", amount)
//                .appendQueryParameter("cu", "INR")
//                //.appendQueryParameter("refUrl", "blueapp")
//                .build();
        Intent upiPayIntent = new Intent(Intent.ACTION_VIEW);
        String merchantUPILink = "upi://pay?pa=9545459549@axl&pn=Mohammadsaad%20Mulla&mc=0000&mode=02&purpose=00" ;
        upiPayIntent.setData(Uri.parse(merchantUPILink + "&am=" + amount));

        Intent chooser = Intent.createChooser(upiPayIntent, "Pay With: ");
        if(null != chooser.resolveActivity(getPackageManager())) {
            startActivityForResult(chooser, UPI_PAYMENT);
        } else {
            Toast.makeText(this,"Payment Application Not Found!",Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.e("main ", "response "+resultCode );
        /*
       E/main: response -1
       E/UPI: onActivityResult: txnId=AXI4a3428ee58654a938811812c72c0df45&responseCode=00&Status=SUCCESS&txnRef=922118921612
       E/UPIPAY: upiPaymentDataOperation: txnId=AXI4a3428ee58654a938811812c72c0df45&responseCode=00&Status=SUCCESS&txnRef=922118921612
       E/UPI: payment successfull: 922118921612
         */
        switch (requestCode) {

            case UPI_PAYMENT:
                if ((RESULT_OK == resultCode) || (resultCode == 11)) {
                    if (data != null) {
                        String trxt = data.getStringExtra("response");
                        Log.e("UPI", "onActivityResult: " + trxt);
                        ArrayList<String> dataList = new ArrayList<>();
                        dataList.add(trxt);

                        upiPaymentDataOperation(dataList);

                    } else {
                        Log.e("UPI", "onActivityResult: " + "Return data is null");
                        ArrayList<String> dataList = new ArrayList<>();
                        dataList.add("nothing");
                        upiPaymentDataOperation(dataList);
                    }
                } else {
                    //when user simply back without payment
                    Log.e("UPI", "onActivityResult: " + "Return data is null");
                    ArrayList<String> dataList = new ArrayList<>();
                    dataList.add("nothing");
                    upiPaymentDataOperation(dataList);
                }
                break;
        }
    }
    private void upiPaymentDataOperation(ArrayList<String> data) {
        if (isConnectionAvailable(this)) {
            String str = data.get(0);
            Log.e("UPIPAY", "upiPaymentDataOperation: "+str);
            String paymentCancel = "";
            if(str == null) str = "discard";
            String status = "";
            String approvalRefNo = "";
            String response[] = str.split("&");
            for (int i = 0; i < response.length; i++) {
                String equalStr[] = response[i].split("=");
                if(equalStr.length >= 2) {
                    if (equalStr[0].toLowerCase().equals("Status".toLowerCase())) {
                        status = equalStr[1].toLowerCase();
                    }
                    else if (equalStr[0].toLowerCase().equals("ApprovalRefNo".toLowerCase()) || equalStr[0].toLowerCase().equals("txnRef".toLowerCase())) {
                        approvalRefNo = equalStr[1];
                    }
                }
                else {
                    paymentCancel = "Payment cancelled by user.";
                }
            }
            if (status.equals("success")) {
                //Code to handle successful transaction here.
                Toast.makeText(this, "Transaction successful.", Toast.LENGTH_SHORT).show();
                Log.e("UPI", "payment successfull: "+approvalRefNo);

                save();


            }
            else if("Payment cancelled by user.".equals(paymentCancel)) {
                Toast.makeText(this, "Payment cancelled by user.", Toast.LENGTH_SHORT).show();
                Log.e("UPI", "Cancelled by user: "+approvalRefNo);
            }
            else {
                Toast.makeText(this, "Transaction failed.Please try again", Toast.LENGTH_SHORT).show();
                Log.e("UPI", "failed payment: "+approvalRefNo);
            }
        } else {
            Log.e("UPI", "Internet issue: ");
            Toast.makeText(this, "Internet connection is not available. Please check and try again", Toast.LENGTH_SHORT).show();
        }
    }
    public static boolean isConnectionAvailable(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivityManager != null) {
            NetworkInfo netInfo = connectivityManager.getActiveNetworkInfo();
            if (netInfo != null && netInfo.isConnected()
                    && netInfo.isConnectedOrConnecting()
                    && netInfo.isAvailable()) {
                return true;
            }
        }
        return false;
    }



    public void save()
    {
        String name="";
        Accessories_Db db = new Accessories_Db(this);
        try {
            BufferedReader br = new BufferedReader(new FileReader("sesion.ini"));

          name =br.readLine();





        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i=0;i<pname.size();i++)
        {
            db.insertData(name,pname.get(i),pprice.get(i));
        }
    }

}