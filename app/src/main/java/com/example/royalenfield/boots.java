package com.example.royalenfield;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.Toast;

public class boots extends AppCompatActivity {


    CheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boots);
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

    }

    public void click2(View view)
    {
        StringBuilder name=new StringBuilder();
        StringBuilder price=new StringBuilder();
        StringBuilder n= new StringBuilder();
        StringBuilder p = new StringBuilder();

        int total=0;
        boolean ischecked=false;
//        result.append("\n       SELECTED BOOTS : ");
        if(c1.isChecked())
        {
//            result.append("\n\nAMBLER SHOES - BLACK NAVY INR - 3800");
            name.append("\tAMBLER SHOES-BLACK NAVY\n\n");
            price.append(" INR - 3800\n\n");
            ischecked=true;
            total+=3800;

            n.append("AMBLER SHOES-BLACK NAVY^");
            p.append("3800^");
        }
        if(c2.isChecked())
        {
//            result.append("\nBlack Passenger Backrest Mounts INR - 3800");
            name.append("\tBlack Passenger Backrest \n\n");
            price.append(" INR - 3800\n\n");
            ischecked=true;
            total+=3800;
            n.append("Black Passenger Backrest^");
            p.append("3800^");
        }
        if(c3.isChecked())
        {
//            result.append("\nAMBLER SHOES - GREY RED INR - 3800");
            name.append("\tAMBLER SHOES-GREY RED\n\n");
            price.append(" INR - 3800\n\n");
            ischecked=true;
            total+=3800;
            n.append("AMBLER SHOES-GREY RED^");
            p.append("3800^");
        }
        if(c4.isChecked())
        {
//            result.append("\nTRIBE BOOTS - BROWN OLIVE INR - 4800");
            name.append("\tTRIBE BOOTS-BROWN OLIVE\n\n");
            price.append(" INR - 4800\n\n");
            ischecked=true;
            total+=4800;
            n.append("TRIBE BOOTS-BROWN OLIVE^");
            p.append("4800^");
        }
        if(c5.isChecked())
        {
//            result.append("\nJUNKET BOOTS - BROWN and OLIVE  INR - 4800");
            name.append("\tJUNKET BOOTS - BROWN\n\n");
            price.append(" INR - 4800\n\n");
            ischecked=true;
            total+=4800;
            n.append("JUNKET BOOTS - BROWN^");
            p.append("4800^");
        }
        if(c6.isChecked())
        {
//            result.append("\n\"CAPER SHOES - NAVY INR - 4800");
            name.append("\tCAPER SHOES - NAVY\n\n");
            price.append(" INR - 4800\n\n");
            ischecked=true;
            total+=4800;
            n.append("CAPER SHOES - NAVY^");
            p.append("4800^");
        }
        if(c7.isChecked())
        {
//            result.append("\nCAPER SHOES - BROWN INR - 4800");
            name.append("\tCAPER SHOES - BROWN \n\n");
            price.append(" INR - 4800\n\n");
            ischecked=true;
            total+=4800;
            n.append("CAPER SHOES - BROWN^");
            p.append("4800^");
        }
        if(c8.isChecked())
        {
//            result.append("\nSCUD SHOES - RED INR - 4600");
            name.append("\tSCUD SHOES - RED\n\n");
            price.append(" INR - 4600\n\n");
            ischecked=true;
            total+=4600;
            n.append("SCUD SHOES - RED^");
            p.append("4600^");
        }
        if(c9.isChecked())
        {
//            result.append("\nSCUD SHOES - GREY INR - 4600");
            name.append("\tSCUD SHOES - GREY\n\n");
            price.append(" INR - 4600\n\n");
            ischecked=true;
            total+=4600;
            n.append("SCUD SHOES - GREY^");
            p.append("4600^");
        }
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

//        result.append("\n\n  TOTAL OF BOOTS :"+total+" Rs.");
//        Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();


    }
}