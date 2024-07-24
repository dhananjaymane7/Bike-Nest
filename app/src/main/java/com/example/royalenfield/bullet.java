package com.example.royalenfield;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.Toast;

public class bullet extends AppCompatActivity {


    CheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bullet);
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
        StringBuilder n= new StringBuilder();
        StringBuilder p = new StringBuilder();
        int total=0;


//        result.append("\n       Selected Accessories: ");
        if(c1.isChecked())
        {
//            result.append("\n\nBlack Octagon Engine Guard INR - 2450");
            name.append("\tBlack Octagon Engine Guard\n\n");
            price.append(" INR - 2450\n\n");
            ischecked=true;
            total+=2450;
            n.append("Black Octagon Engine Guard^");
            p.append("2450^");
        }
        if(c2.isChecked())
        {
//            result.append("\nSilver Octagon Engine Guard INR - 2950");
            name.append("\tSilver Octagon Engine Guard\n\n");
            price.append(" INR - 2950\n\n");
            ischecked=true;
            total+=2950;
            n.append("Silver Octagon Engine Guard^");
            p.append("2950^");
        }
        if(c3.isChecked())
        {
//            result.append("\nBlack Airfly Engine Guard INR 3800");
            name.append("\tBlack Airfly Engine Guard\n\n");
            price.append(" INR - 3800\n\n");
            ischecked=true;
            total+=3800;
            n.append("Black Airfly Engine Guard^");
            p.append("3800^");
        }
        if(c4.isChecked())
        {
//            result.append("\nBlack Headlight Grille INR - 1200");
            name.append("\tBlack Headlight Grille\n\n");
            price.append(" INR - 1200\n\n");
            ischecked=true;
            total+=1200;
            n.append("Black Headlight Grille^");
            p.append("1200^");
        }
        if(c5.isChecked())
        {
//            result.append("\nBlack Touring Dual Seat INR - 4250");
            name.append("\tBlack Touring Dual Seat\n\n");
            price.append(" INR - 4250\n\n");
            ischecked=true;
            total+=4250;
            n.append("Black Touring Dual Seat^");
            p.append("4250^");
        }
        if(c6.isChecked())
        {
//            result.append("\n\"Silver Headlight Visor INR - 250");
            name.append("\tSilver Headlight Visor\n\n");
            price.append(" INR - 250\n\n");
            total+=250;
            ischecked=true;
            n.append("Silver Headlight Visor^");
            p.append("250^");

        }
        if(c7.isChecked())
        {
//            result.append("\nBlack Water Resistant Bike Cover INR - 1100");
            name.append("\tBlack Water Resistant Bike Cover\n\n");
            price.append(" INR - 1100\n\n");
            total+=1100;
            ischecked=true;
            n.append("Black Water Resistant Bike Cover^");
            p.append("1100^");

        }
        if(c8.isChecked())
        {
//            result.append("\nBlack Front Reservoir Cap INR - 800");
            name.append("\tBlack Front Reservoir Cap\n\n");
            price.append(" INR - 800\n\n");
            total+=800;
            ischecked=true;
            n.append("Black Front Reservoir Cap^");
            p.append("800^");

        }
        if(c9.isChecked())
        {
//            result.append("\nSilver Airfly Engine Guard INR - 4250");
            name.append("\tSilver Airfly Engine Guard\n\n");
            price.append(" INR - 4250\n\n");
            total+=4250;
            ischecked=true;
            n.append("Silver Airfly Engine Guard^");
            p.append("4250^");

        }
        if(c10.isChecked())
        {
//            result.append("\nBlack Straight Engine Bar INR 2400");
            name.append("\tBlack Straight Engine Bar\n\n");
            price.append(" INR - 2400\n\n");
            total+=2400;
            ischecked=true;
            n.append("Black Straight Engine Bar^");
            p.append("2400^");

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