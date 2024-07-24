package com.example.royalenfield;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.Toast;

public class helmet extends AppCompatActivity {


    CheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helmet);
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

//        result.append("\n       Selected Helmets: ");
        if(c1.isChecked())
        {
//            result.append("\n\nESCAPADE HELMET NS - BATTLE GREEN INR - 3200");
            name.append("\tESCAPADE HELMET-BATTLE GREEN\n\n");
            price.append(" INR - 3200\n\n");
            ischecked=true;
            total+=3200;
            n.append("ESCAPADE HELMET-BATTLE GREEN^");
            p.append("3200^");
        }
        if(c2.isChecked())
        {
//            result.append("\nESCAPADE HELMET NS - DESERT STORM INR - 3200");
            name.append("\t ESCAPADE HELMET-DESERT STORM\n\n");
            price.append(" INR - 3200\n\n");
            ischecked=true;
            total+=3200;
            n.append("ESCAPADE HELMET-DESERT STORM^");
            p.append("3200^");
        }
        if(c3.isChecked())
        {
//            result.append("\nESCAPADE HELMET NS - SQUADRON BLUE INR - 3200");
            name.append("\t ESCAPADE HELMET - BLUE\n\n");
            price.append(" INR - 3200\n\n");
            ischecked=true;
            total+=3200;
            n.append("ESCAPADE HELMET - BLUE^");
            p.append("3200^");
        }
        if(c4.isChecked())
        {
//            result.append("\nESCAPADE HELMET NS - GLOSS WHITE INR - 3200");
            name.append("\tESCAPADE HELMET-GLOSS WHITE\n\n");
            price.append(" INR - 3200\n\n");
            ischecked=true;
            total+=3200;
            n.append("ESCAPADE HELMET-GLOSS WHITE^");
            p.append("3200^");
        }
        if(c5.isChecked())
        {
//            result.append("\nNH44 HELMET - GLOSS RED INR - 4500");
            name.append("\t NH44 HELMET - GLOSS RED\n\n");
            price.append(" INR - 4500\n\n");
            ischecked=true;
            total+=4500;
            n.append("NH44 HELMET - GLOSS RED^");
            p.append("4500^");
        }
        if(c6.isChecked())
        {
//            result.append("\n\"NH44 HELMET - MATT BLACK INR - 3100");
            name.append("\t NH44 HELMET-MATT BLACK\n\n");
            price.append(" INR - 3100\n\n");
            ischecked=true;
            total+=3100;
            n.append("NH44 HELMET-MATT BLACK^");
            p.append("3100^");
        }
        if(c7.isChecked())
        {
//            result.append("\nNH44 - GLOSS RED ECE and ISI CERTIFIED INR - 4800");
            name.append("\t GLOSS ISI CERTIFIED\n\n");
            price.append(" INR - 4800\n\n");
            ischecked=true;
            total+=4800;
            n.append("GLOSS ISI CERTIFIED^");
            p.append("4800^");
        }
        if(c8.isChecked())
        {
//            result.append("\nCHOPPER MLG CAMO HELMET-DESERT STORM INR - 2700");
            name.append("\t CHOPPER HELMET-DESERT STORM\n\n");
            price.append(" INR - 2700\n\n");
            ischecked=true;
            total+=2700;
            n.append("CHOPPER HELMET-DESERT STORM^");
            p.append("2700^");
        }
        if(c9.isChecked())
        {
//            result.append("\nCHOPPER MLG CAMO HELMET-MATT BLACK INR - 2700");
            name.append("\t CHOPPER HELMET-MATT BLACK\n\n");
            price.append(" INR - 2700\n\n");
            ischecked=true;
            total+=2700;
            n.append("CHOPPER HELMET-MATT BLACK^");
            p.append("2700^");
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
//        result.append("\n\n  Total of Helmets :"+total+" Rs.");
//        Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();


    }
}