package com.example.royalenfield;

import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class scrampdf extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrampdf);

        // create a new renderer
        /*PdfRenderer renderer = new PdfRenderer(getSeekableFileDescriptor());

        // let us just render all pages
        final int pageCount = renderer.getPageCount();
        for (int i = 0; i < pageCount; i++) {
            PdfRenderer.Page page = renderer.openPage(i);

            // say we render for showing on the screen
            page.render(mBitmap, null, null, Page.RENDER_MODE_FOR_DISPLAY);

            // do stuff with the bitmap

            // close the page
            page.close();
        }

        // close the renderer
        renderer.close();*/
    }



}