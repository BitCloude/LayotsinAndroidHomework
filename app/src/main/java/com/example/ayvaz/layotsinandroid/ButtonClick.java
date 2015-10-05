package com.example.ayvaz.layotsinandroid;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ButtonClick extends Activity implements View.OnClickListener {
    Button button1, button2, button3, switchbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_click);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        switchbutton = (Button) findViewById(R.id.switchbutton);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Button 2 clicked", Toast.LENGTH_SHORT).show();
            }
        });
        switchbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Frame_Layout.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(this);

    }

    public void button1Click(View view) {
        Toast.makeText(getApplicationContext(), "Button 1 clicked", Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onClick(View v) {
        Toast.makeText(getApplicationContext(), "Button 3 clicked", Toast.LENGTH_SHORT).show();
    }
}
