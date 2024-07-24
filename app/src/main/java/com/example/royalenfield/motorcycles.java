package com.example.royalenfield;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.MediaController;
import android.widget.VideoView;

public class motorcycles extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motorcycles);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
    }

    public void scram(View view)
    {
        Intent i=new Intent(getApplicationContext(),bikepdf.class);
        i.putExtra("pdf_url","https://drive.google.com/file/d/1A2O2JZr5Xa68XB9RutN9F3Szeycj5MWv/view?usp=sharing");
        startActivity(i);

    }

    public void classic(View view)
    {
        Intent i=new Intent(getApplicationContext(),bikepdf.class);
        i.putExtra("pdf_url","https://drive.google.com/file/d/1_avXJCiFrRbZp5JK2VmFXEgK6KLl3RYU/view?usp=sharing");
        startActivity(i);
    }

    public void meteor(View view)
    {
        Intent i=new Intent(getApplicationContext(),bikepdf.class);
        i.putExtra("pdf_url","https://drive.google.com/file/d/19WAD3Yl0wZLwNiYVzI8JSlXmh7PtFmcs/view?usp=sharing");
        startActivity(i);
    }

    public void interceptor(View view)
    {
        Intent i=new Intent(getApplicationContext(),bikepdf.class);
        i.putExtra("pdf_url","https://drive.google.com/file/d/1IYf5o33RaLSRbFMmV3hZx5NVcj7PFnLk/view?usp=sharing");
        startActivity(i);
    }

    public void continental(View view)
    {
        Intent i=new Intent(getApplicationContext(),bikepdf.class);
        i.putExtra("pdf_url","https://drive.google.com/file/d/1dlf8PLF4KVDRBXqjiLxTsqXQUR4gmQFS/view?usp=sharing");
        startActivity(i);
    }

    public void himalayan(View view)
    {
        Intent i=new Intent(getApplicationContext(),bikepdf.class);
        i.putExtra("pdf_url","https://drive.google.com/file/d/1d5bNO81s0IPoyva9Ky20iHMlxUUt9u85/view?usp=sharing");
        startActivity(i);
    }

    public void bullet(View view)
    {
        Intent i=new Intent(getApplicationContext(),bikepdf.class);
        i.putExtra("pdf_url","https://drive.google.com/file/d/1YQATayVfqizoKFGnx31LR5GSL3gF5sgl/view?usp=sharing");
        startActivity(i);
    }
}