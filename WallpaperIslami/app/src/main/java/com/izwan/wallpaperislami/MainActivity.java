package com.izwan.wallpaperislami;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private ImageView Igambar1,Igambar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Igambar1 = (ImageView) findViewById(R.id.image1);
        Igambar2 = (ImageView) findViewById(R.id.image2);

        Igambar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, IslamActivity1.class );
                startActivity(intent);
            }
        });

        Igambar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, IslamActivity1.class );
                startActivity(intent);
            }
        });


    }
}
