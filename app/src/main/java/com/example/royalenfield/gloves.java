package com.example.royalenfield;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.Toast;

public class gloves extends AppCompatActivity {


    CheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gloves);
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

    public void order(View view)
    {
        int total=0;
        boolean ischecked=false;

        StringBuilder name=new StringBuilder();
        StringBuilder price=new StringBuilder();
        StringBuilder n= new StringBuilder();
        StringBuilder p = new StringBuilder();

//        result.append("\n       SELECTED GLOVES: ");
        if(c1.isChecked())
        {
//            result.append("\n\n HEATED GLOVES - BLACK INR - 9000");
            name.append("\tHEATED GLOVES - BLACK\n\n");
            price.append(" INR - 9000\n\n");
            ischecked=true;
            total+=9000;
            n.append("HEATED GLOVES - BLACK^");
            p.append("9000^");
        }
        if(c2.isChecked())
        {
//            result.append("\nCRAGSMAN GLOVES-BLACK INR - 3100");
            name.append("\tCRAGSMAN GLOVES-BLACK\n\n");
            price.append(" INR - 3100\n\n");
            ischecked=true;
            total+=3100;
            n.append("CRAGSMAN GLOVES-BLACK^");
            p.append("3100^");
        }
        if(c3.isChecked())
        {
//            result.append("\nCRAGSMAN GLOVES BLACK and BROWN INR - 3100");
            name.append("\tCRAGSMAN GLOVES BLACK\n\n");
            price.append(" INR - 3100\n\n");
            ischecked=true;
            total+=3100;
            n.append("CRAGSMAN GLOVES-BLACK^");
            p.append("3100^");
        }
        if(c4.isChecked())
        {
//            result.append("\nBLIZZARD GLOVES BLACK and RED INR - 3750");
            name.append("\tBLIZZARD GLOVES BLACK\n\n");
            price.append(" INR - 3750\n\n");
            ischecked=true;
            total+=3750;
            n.append("BLIZZARD GLOVES BLACK^");
            p.append("3750^");
        }
        if(c5.isChecked())
        {
//            result.append("\nSTOUT GLOVES BROWN  INR - 4500");
            name.append("\tSTOUT GLOVES BROWN\n\n");
            price.append(" INR - 4500\n\n");
            ischecked=true;
            total+=4500;
            n.append("STOUT GLOVES BROWN^");
            p.append("4500^");
        }
        if(c6.isChecked())
        {
//            result.append("\n\"VAMOS GLOVES BLACK INR - 4200");
            name.append("\tVAMOS GLOVES BLACK\n\n");
            price.append(" INR - 4200\n\n");
            ischecked=true;
            total+=4200;
            n.append("VAMOS GLOVES BLACK^");
            p.append("4200^");
        }
        if(c7.isChecked())
        {
//            result.append("\nVINTAGE RIDING WOMEN'S GLOVES - BROWN INR - 2950");
            name.append("\tVINTAGE RIDING WOMEN'S GLOVES\n\n");
            price.append(" INR - 2950\n\n");
            ischecked=true;
            total+=2950;
            n.append("VINTAGE RIDING WOMEN'S GLOVES^");
            p.append("2950^");
        }
        if(c8.isChecked())
        {
//            result.append("\nROADBOUND GLOVES-OLIVE INR - 3750");
            name.append("\tROADBOUND GLOVES-OLIVE\n\n");
            price.append(" INR - 3750\n\n");
            ischecked=true;
            total+=3750;
            n.append("ROADBOUND GLOVES-OLIVE^");
            p.append("3750^");
        }
        if(c9.isChecked())
        {
//            result.append("\nROADBOUND GLOVES BLACK INR - 3750");
            name.append("\tROADBOUND GLOVES BLACK\n\n");
            price.append(" INR - 3750\n\n");
            ischecked=true;
            total+=3750;
            n.append("ROADBOUND GLOVES BLACK^");
            p.append("3750^");
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

//        result.append("\n\n  TOTAL OF GLOVES :"+total+" RS.");
//        Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();


    }
}