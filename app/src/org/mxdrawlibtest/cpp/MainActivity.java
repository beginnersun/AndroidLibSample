package org.mxdrawlibtest.cpp;

import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.MxDraw.MxFunction;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnOpenCAD = (Button)findViewById(R.id.opencad);
        btnOpenCAD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //System.loadLibrary("mxdrawobj");
                //String sBufFile = MxFunction.getBufferFileName("xxxx.dwg");

                Intent myIntent = new Intent(getApplicationContext(), MxCADAppActivity.class);
                String dirMxDraw = Environment.getExternalStorageDirectory() + "/"+ "TestMxLib";
                //myIntent.putExtra("file",dirMxDraw +  "/sample.dwg");
                //myIntent.putExtra("file",dirMxDraw +  "/sample.dwg");
                myIntent.putExtra("file",dirMxDraw +  "/t1.dwg");
                //myIntent.putExtra("file",dirMxDraw +  "/test.dwg");
                //myIntent.putExtra("file",dirMxDraw +  "/cddtcad.dwg");

                //myIntent.putExtra("file",dirMxDraw +  "/tsel.dwg");
                startActivityForResult(myIntent, 0);
            }
        });


    }

}
