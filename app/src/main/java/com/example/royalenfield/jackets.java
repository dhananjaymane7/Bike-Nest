package com.example.royalenfield;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.Toast;

public class jackets extends AppCompatActivity {


    CheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jackets);
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
        int total=0;
        boolean ischecked=false;
        StringBuilder name=new StringBuilder();
        StringBuilder price=new StringBuilder();
        StringBuilder n= new StringBuilder();
        StringBuilder p = new StringBuilder();

//        result.append("\n       SELECTED JACKETS: ");
        if(c1.isChecked())
        {
//            result.append("\n\n KHARDUNGLA V2 JACKET-OLIVE INR - 12950");
            name.append("\t KHARDUNGLA JACKET-OLIVE\n\n");
            price.append(" INR - 12950\n\n");
            ischecked=true;
            total+=12950;
            n.append("KHARDUNGLA JACKET-OLIVE^");
            p.append("12950^");
        }
        if(c2.isChecked())
        {
//            result.append("\n STREETWIND V2 JACKET OLIVE CAMO INR - 5250");
            name.append("\tSTREETWIND JACKET OLIVE CAMO\n\n");
            price.append(" INR - 5250\n\n");
            ischecked=true;
            total+=5250;
            n.append("STREETWIND JACKET OLIVE CAMO^");
            p.append("5250^");
        }
        if(c3.isChecked())
        {
//            result.append("\n STREETWIND V2 JACKET RED INR - 4950");
            name.append("\t STREETWIND JACKET RED\n\n");
            price.append(" INR - 4950\n\n");
            ischecked=true;
            total+=4950;
            n.append("STREETWIND JACKET RED^");
            p.append("4950^");
        }
        if(c4.isChecked())
        {
//            result.append("\nSTREETWIND V2 JACKET GREY INR - 4950");
            name.append("\tSTREETWIND JACKET GREY\n\n");
            price.append(" INR - 4950\n\n");
            ischecked=true;
            total+=4950;
            n.append("STREETWIND JACKET GREY^");
            p.append("4950^");
        }
        if(c5.isChecked())
        {
//            result.append("\nKHARDUNG LA JACKET OLIVE INR - 11200");
            name.append("\tKHARDUNG JACKET OLIVE\n\n");
            price.append(" INR - 11200\n\n");
            ischecked=true;
            total+=11200;
            n.append("KHARDUNG JACKET OLIVE^");
            p.append("11200^");
        }
        if(c6.isChecked())
        {
//            result.append("\n\"KHARDUNGLA V2 JACKET-GREY INR - 12950");
            name.append("\tKHARDUNGLA JACKET-GREY\n\n");
            price.append(" INR - 12950\n\n");
            ischecked=true;
            total+=12950;
            n.append("KHARDUNGLA JACKET-GREY^");
            p.append("12950^");
        }
        if(c7.isChecked())
        {
//            result.append("\nSTREETWIND V2 JACKET BLACK INR - 4950");
            name.append("\tSTREETWIND JACKET BLACK\n\n");
            price.append(" INR - 4950\n\n");
            ischecked=true;
            total+=4950;
            n.append("STREETWIND JACKET BLACK^");
            p.append("4950^");
        }
        if(c8.isChecked())
        {
//            result.append("\n STORMRAIDER-GREY INR - 9950");
            name.append("\tSTORMRAIDER-GREY \n\n");
            price.append(" INR - 9950\n\n");
            ischecked=true;
            total+=9950;
            n.append("STORMRAIDER-GREY ^");
            p.append("9950^");
        }
        if(c9.isChecked())
        {
//            result.append("\n WINDFARER JACKET-OLIVE INR - 6950");
            name.append("\t WINDFARER JACKET-OLIVE \n\n");
            price.append(" INR - 6950\n\n");
            ischecked=true;
            total+=6950;
            n.append("WINDFARER JACKET-OLIVE ^");
            p.append("6950^");
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

//        result.append("\n\n  TOTAL OF JACKETS :"+total+" RS.");
//        Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();


    }


}