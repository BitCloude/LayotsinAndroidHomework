package com.example.ayvaz.layotsinandroid;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class Frame_Layout extends Activity implements OnClickListener {
ImageView image1,image2;
    Button gridview, linearhoriz, linearvert, main, relative, table;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame__layout);
        image1 = (ImageView) findViewById(R.id.imageView);
        image2 = (ImageView) findViewById(R.id.imageView2);
        image1.setOnClickListener(this);
        image2.setOnClickListener(this);
        gridview = (Button) findViewById(R.id.gridview);
        linearhoriz = (Button) findViewById(R.id.linearhorizontal);
        linearvert = (Button) findViewById(R.id.linearvert);
        main = (Button) findViewById(R.id.main);
        relative = (Button) findViewById(R.id.relative);
        table = (Button) findViewById(R.id.table);
        gridview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), GridView.class);
                startActivity(intent);
            }
        });
        linearhoriz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LinearHorizontal.class);
                startActivity(intent);
            }
        });
        linearvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LinearVertical.class);
                startActivity(intent);
            }
        });
        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
        relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RelayoutExample.class);
                startActivity(intent);
            }
        });
        table.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TableLayout.class);
                startActivity(intent);
            }
        });

    }


    @Override
    public void onClick(View v) {
        int id = v.getId();
        if(id == R.id.imageView){
            image1.setVisibility(View.GONE);
            image2.setVisibility(View.VISIBLE);
        }
        else{
            image1.setVisibility(View.VISIBLE);
            image2.setVisibility(View.GONE);
        }

    }
}
