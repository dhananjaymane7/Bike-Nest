package com.example.royalenfield;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.Toast;

public class himalaya extends AppCompatActivity {


    CheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_himalaya);
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

     //   result.append("\n       Selected Accessories: ");
        if(c1.isChecked())
        {
         //   result.append("\n\nBlack Touring Rider Seat INR - 3050");
            name.append("\tBlack Touring Rider Seat\n\n ");
            price.append(" INR - 3050\n\n");
            total+=3050;
            ischecked=true;
            n.append("Black Touring Rider Seat^");
            p.append("3050^");
        }
        if(c2.isChecked())
        {
         //   result.append("\nSilver Adventure Panniers INR 29900");
            name.append("\tSilver Adventure Panniers\n\n ");
            price.append(" INR - 29900\n\n");
            total+=29900;
            ischecked=true;
            n.append("Silver Adventure Panniers^");
            p.append("29900^");

        }
        if(c3.isChecked())
        {
         //   result.append("\nBlack Adventure Panniers INR 29900");
            name.append("\tBlack Adventure Panniers\n\n ");
            price.append(" INR - 29900\n\n");
            total+=29900;
            ischecked=true;
            n.append("Black Adventure Panniers^");
            p.append("29900^");

        }
        if(c4.isChecked())
        {
         //   result.append("\nSilver Master Cylinder Guard INR 700");
            name.append("\tSilver Master Cylinder Guard\n\n ");
            price.append(" INR - 700\n\n");
            total+=700;
            ischecked=true;
            n.append("Silver Master Cylinder Guard^");
            p.append("700^");

        }
        if(c5.isChecked())
        {
        //    result.append("\nBlack Oil Cooler Guard INR - 1250");
            name.append("\tBlack Oil Cooler Guard\n\n ");
            price.append(" INR - 1250\n\n");
            total+=1250;
            ischecked=true;
            n.append("Black Oil Cooler Guard^");
            p.append("1250^");

        }
        if(c6.isChecked())
        {
         //   result.append("\n\"Black Master Cylinder Guard INR - 700");
            name.append("\tBlack Master Cylinder Guard\n\n ");
            price.append(" INR - 700\n\n");
            total+=700;
            ischecked=true;
            n.append("Black Master Cylinder Guard^");
            p.append("700^");

        }
        if(c7.isChecked())
        {
        //    result.append("\nBlack Large Engine Guards INR - 1650");
            name.append("\tBlack Large Engine Guards\n\n ");
            price.append(" INR - 1650\n\n");
            total+=1650;
            ischecked=true;
            n.append("Black Large Engine Guards^");
            p.append("1650^");

        }
        if(c8.isChecked())
        {
          //  result.append("\nBlack Compact Engine Guards INR - 1450");
            name.append("\tBlack Compact Engine Guards\n\n ");
            price.append(" INR - 1450\n\n");
            total+=1450;
            ischecked=true;
            n.append("Black Compact Engine Guards^");
            p.append("1450^");

        }
        if(c9.isChecked())
        {
         //   result.append("\nBlack Adventure Handguards INR - 2550");
            name.append("\tBlack Adventure Handguards\n\n ");
            price.append(" INR - 2550\n\n");
            total+=2550;
            ischecked=true;
            n.append("Black Adventure Handguards^");
            p.append("2550^");

        }
        if(c10.isChecked())
        {
          //  result.append("\nNavy Water Resistant Bike Cover INR - 1100");
            name.append("\tNavy Water Resistant Bike Cover\n\n ");
            price.append(" INR - 1100\n\n");
            total+=1100;
            ischecked=true;
            n.append("Navy Water Resistant Bike Cover^");
            p.append("1100^");

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