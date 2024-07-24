package com.example.royalenfield;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class bikepdf extends AppCompatActivity
{

    WebView wb;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bikepdf);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        String url=getIntent().getStringExtra("pdf_url");
        wb=findViewById(R.id.wb);
        wb.setWebViewClient(new WebViewClient());
        wb.getSettings().setSupportZoom(true);
        wb.getSettings().setJavaScriptEnabled(true);
        wb.loadUrl(url);
        Toast.makeText(this, "Please wait for few seconds....", Toast.LENGTH_SHORT).show();
    }
}