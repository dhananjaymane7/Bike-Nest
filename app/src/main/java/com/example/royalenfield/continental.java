package com.example.royalenfield;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.Toast;

public class continental extends AppCompatActivity {

    CheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_continental);
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
        boolean ischecked=false;
        int total=0;
        StringBuilder n= new StringBuilder();
        StringBuilder p = new StringBuilder();


        //     result.append("\n       Selected Accessories: ");
        if(c1.isChecked())
        {
       //     result.append("\n\nIce Queen Single Seat Cowl INR - 2650");
            name.append("\tIce Queen Single Seat Cowl\n\n ");
            price.append(" INR - 2650\n\n");
            ischecked=true;
            total+=2650;
            n.append("Ice Queen Single Seat Cowl^");
            p.append("2650^");
        }
        if(c2.isChecked())
        {
       //     result.append("\nTinted Tall Flyscreen INR - 2150");
            name.append("\tTinted Tall Flyscreen\n\n ");
            price.append(" INR - 2150\n\n");
            total+=2150;
            ischecked=true;
            n.append("Tinted Tall Flyscreen^");
            p.append("2150^");

        }
        if(c3.isChecked())
        {
        //    result.append("\nSilver Bar End Finishers INR - 1100");
            name.append("\tSilver Bar End Finishers\n\n ");
            price.append(" INR - 1100\n\n");
            total+=1100;
            ischecked=true;
            n.append("Silver Bar End Finishers^");
            p.append("1100^");

        }
        if(c4.isChecked())
        {
         //   result.append("\nVentura Blue Single Seat Cowl INR - 2650");
            name.append("\tVentura Blue Single Seat Cowl\n\n ");
            price.append(" INR - 2650\n\n");
            total+=2650;
            ischecked=true;
            n.append("Ventura Blue Single Seat Cowl^");
            p.append("2650^");

        }
        if(c5.isChecked())
        {
       //     result.append("\nBlack Heel Guards INR - 1200");
            name.append("\tBlack Heel Guards\n\n ");
            price.append(" INR - 1200\n\n");
            total+=1200;
            ischecked=true;
            n.append("Black Heel Guards^");
            p.append("1200^");

        }
        if(c6.isChecked())
        {
        //    result.append("\n\"Silver Large Engine Guards INR - 3350");
            name.append("\tSilver Large Engine Guards\n\n ");
            price.append(" INR - 3350\n\n");
            total+=3350;
            ischecked=true;
            n.append("Silver Large Engine Guards^");
            p.append("3350^");

        }
        if(c7.isChecked())
        {
        //    result.append("\nSilver Sumpguard INR - 2500");
            name.append("\tSilver Sumpguard\n\n ");
            price.append(" INR - 2500\n\n");
            total+=2500;
            ischecked=true;
            n.append("Silver Sumpguard^");
            p.append("2500^");

        }
        if(c8.isChecked())
        {
        //    result.append("\nBlack Fork Gaitors INR - 850");
            name.append("\tBlack Fork Gaitors\n\n ");
            price.append(" INR - 850\n\n");
            total+=850;
            ischecked=true;
            n.append("Black Fork Gaitors^");
            p.append("850^");

        }
        if(c9.isChecked())
        {
       //     result.append("\nBritish Racing Green Dual Seat Cowl INR - 3050");
            name.append("\tBritish Racing Green Dual Seat Cowl\n\n ");
            price.append(" INR - 3050\n\n");
            total+=3050;
            ischecked=true;
            n.append("British Racing Green Dual Seat Cowl^");
            p.append("3050^");

        }
        if(c10.isChecked())
        {
         //   result.append("\nVentura Blue Dual Seat Cowl INR - 3050");
            name.append("\tVentura Blue Dual Seat Cowl\n\n ");
            price.append(" INR - 3050\n\n");
            total+=3050;
            ischecked=true;
            n.append("Ventura Blue Dual Seat Cowl^");
            p.append("3050^");

        }
     //   result.append("\n\n  Total of Accessories :"+total+" Rs.");
      //  Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
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