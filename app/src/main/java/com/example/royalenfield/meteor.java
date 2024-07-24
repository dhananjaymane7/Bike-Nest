package com.example.royalenfield;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.Toast;

public class meteor extends AppCompatActivity {


    CheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meteor);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        c1=findViewById(R.id.c1);
        c2=findViewById(R.id.c2);
        c3=findViewById(R.id.c3);
        c4=findViewById(R.id.c4);
        c5=findViewById(R.id.c5);
        c6=findViewById(R.id.c6);
        c7=findViewById(R.id.c7);
        c8=findViewById(R.id.c8);
        c9=findViewById(R.id.c9);
        c10=findViewById(R.id.c10);


    }

    public void click2(View view)
    {
        StringBuilder name=new StringBuilder();
        StringBuilder price=new StringBuilder();
        StringBuilder n= new StringBuilder();
        StringBuilder p = new StringBuilder();
        boolean ischecked=false;
        int total=0;

//        result.append("\n       Selected Accessories: ");
        if(c1.isChecked())
        {
//            result.append("\n\nBlack Touring Rider Seat - INR 3950");
            name.append("\tBlack Touring Rider Seat\n\n");
            price.append(" INR 3950\n\n");
            ischecked=true;
            total+=3950;
            n.append("Black Touring Rider Seat^");
            p.append("3950^");
        }
        if(c2.isChecked())
        {
//            result.append("\nBlack Passenger Backrest Mounts - INR 2500");
            name.append("\tBlack Passenger Backrest Mounts\n\n");
            price.append(" INR 2500\n\n");
            ischecked=true;
            total+=2500;
            n.append("Black Passenger Backrest Mounts^");
            p.append("2500^");
        }
        if(c3.isChecked())
        {
//            result.append("\nBlack Touring Passenger Seat - INR 2500");
            name.append("\tBlack Touring Passenger Seat\n\n");
            price.append(" INR 2500\n\n");
            total+=2500;
            ischecked=true;
            n.append("Black Touring Passenger Seat^");
            p.append("2500^");

        }
        if(c4.isChecked())
        {
//            result.append("\nBlack Touring Mirror - INR 6850");
            name.append("\tBlack Touring Mirror\n\n");
            price.append(" INR 6850\n\n");
            total+=6850;
            ischecked=true;
            n.append("Black Touring Mirror^");
            p.append("6850^");

        }
        if(c5.isChecked())
        {
//            result.append("\nBrown Low Ride Rider Seat - INR 2950");
            name.append("\tBrown Low Ride Rider Seat\n\n");
            price.append(" INR 2950\n\n");
            total+=2950;
            ischecked=true;
            n.append("Brown Low Ride Rider Seat^");
            p.append("2950^");

        }
        if(c6.isChecked())
        {
//            result.append("\n\"Silver Sumpguard - INR 3100");
            name.append("\tBrown Low Ride Rider Seat\n\n");
            price.append(" INR 3100\n\n");
            total+=3100;
            ischecked=true;
            n.append("Brown Low Ride Rider Seat^");
            p.append("3100^");

        }
        if(c7.isChecked())
        {
//            result.append("\nBlack Commuter Pannier - INR 2350");
            name.append("\tBrown Low Ride Rider Seat\n\n");
            price.append(" INR 2350\n\n");
            total+=3550;
            ischecked=true;
            n.append("Brown Low Ride Rider Seat^");
            p.append("2350^");

        }
        if(c8.isChecked())
        {
//            result.append("\nBlack Commuter Pannier Rail - INR 2200");
            name.append("\tBrown Low Ride Rider Seat\n\n");
            price.append(" INR 2200\n\n");
            total+=2200;
            ischecked=true;
            n.append("Brown Low Ride Rider Seat^");
            p.append("2200^");

        }
        if(c9.isChecked())
        {
//            result.append("\nBlack and Silver Straightcut Silencer - INR 4500");
            name.append("\tBrown Low Ride Rider Seat\n\n");
            price.append(" INR 4500\n\n");
            total+=4500;
            ischecked=true;
            n.append("Brown Low Ride Rider Seat^");
            p.append("4500^");

        }
        if(c10.isChecked())
        {
//            result.append("\nSilver and Black Straightcut Silencer - INR 4500");
            name.append("\tBrown Low Ride Rider Seat\n\n");
            price.append(" INR 4500\n\n");
            total+=4500;
            ischecked=true;
            n.append("Brown Low Ride Rider Seat^");
            p.append("4500^");

        }
//        result.append("\n\n  Total of Accessories :"+total+" Rs.");
//        Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();

        if(ischecked){
            Intent i=new Intent(this,accessories_bill.class);
            i.putExtra("Name",name+"");
            i.putExtra("Price",price+"");
            i.putExtra("total",String.valueOf(total));
            i.putExtra("n",n+"");
            i.putExtra("p",p+"");
            startActivity(i);
        }
        else{
            Toast.makeText(this, "Please Select Item!", Toast.LENGTH_SHORT).show();
        }

    }
}