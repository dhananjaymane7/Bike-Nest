package com.example.royalenfield;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class scram411 extends AppCompatActivity {

    CheckBox c1,c2,c3,c4,c5,c6,c7,c8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scram411);
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


    }

    public void order(View view)
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
//            result.append("\n\nBlack Bar End Finishers  - INR 1200");
//            total+=1200;
            name.append("\tBlack Bar End Finishers\n\n");
            price.append(" INR 1200\n\n");
            ischecked=true;
            total+=1200;
            n.append("Black Bar End Finishers^");
            p.append("1200^");
        }
        if(c2.isChecked())
        {
//            result.append("\nSilver Master Cylinder Guard  - INR 700");
////            total+=700;
            name.append("\tMaster Cylinder Guard \n\n");
            price.append(" INR 700\n\n");
            ischecked=true;
            total+=700;
            n.append("Master Cylinder Guard^");
            p.append("700^");
        }
        if(c3.isChecked())
        {
//            result.append("\nBlack Oil Cooler Guard - INR 1250");
//            total+=1250;
            name.append("\tBlack Oil Cooler Guard \n\n");
            price.append(" INR 1250\n\n");
            ischecked=true;
            total+=1250;
            n.append("Black Oil Cooler Guard ^");
            p.append("1250^");
        }
        if(c4.isChecked())
        {
//            result.append("\nBlack Master Cylinder Guard - INR 700");
//            total+=700;
            name.append("\tBlack Master Cylinder Guard \n\n");
            price.append(" INR 700\n\n");
            ischecked=true;
            total+=700;
            n.append("Black Master Cylinder Guard ^");
            p.append("700^");
        }
        if(c5.isChecked())
        {
//            result.append("\nBlack Water Resistant Bike Cover - INR 1100");
//            total+=1100;
            name.append("\tBlack Water Resistant Bike Cover \n\n");
            price.append(" INR 1100\n\n");
            ischecked=true;
            total+=1100;
            n.append("Black Water Resistant Bike Cover ^");
            p.append("1100^");
        }
        if(c6.isChecked())
        {
//            result.append("\nBlack Handlebar Brace Pad - INR 600");
//            total+=600;
            name.append("\tBlack Handlebar Brace Pad \n\n");
            price.append(" INR 600\n\n");
            ischecked=true;
            total+=600;
            n.append("Black Handlebar Brace Pad^");
            p.append("600^");
        }
        if(c7.isChecked())
        {
//            result.append("\nBlack Compact Engine Guards - INR 1450");
//            total+=1450;
            name.append("\tBlack Compact Engine Guards\n\n");
            price.append("INR 1450\n\n");
            ischecked=true;
            total+=1450;
            n.append("Black Compact Engine Guards^");
            p.append("1450^");
        }
        if(c8.isChecked())
        {
//            result.append("\nBlack Adventure Handguards - INR 2550\n\n");
//            total+=2550;
            name.append("\tBlack Adventure Handguards\n\n");
            price.append("INR 2550\n\n");
            ischecked=true;
            total+=2550;
            n.append("Black Adventure Handguards^");
            p.append("2550^");
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