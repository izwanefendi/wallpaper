package com.izwan.wallpaper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;

public class IslamActivity extends AppCompatActivity {

    private ImageView imageaja1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_islam);

        imageaja1 = (ImageView) findViewById(R.id.image1);
        imageaja1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IslamActivity.this,GridviewActivity.class);
                startActivity(intent);
            }
        });
    }
}
