package com.izwan.wallpaper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView Igambar1,Igambar2,Igambar3,Igambar4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Igambar1 = (ImageView) findViewById(R.id.image1);
        Igambar2 = (ImageView) findViewById(R.id.image2);
       /* Igambar3 = (ImageView) findViewById(R.id.image3);
        Igambar4 = (ImageView) findViewById(R.id.image4);
*/

        Igambar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, IslamActivity.class );
                startActivity(intent);
            }
        });

        Igambar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Islam2Activity.class );
                startActivity(intent);
            }
        });

    /*    Igambar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, IslamActivity.class );
                startActivity(intent);
            }
        });

        Igambar4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, IslamActivity.class );
                startActivity(intent);
            }
        });*/
    }
}
