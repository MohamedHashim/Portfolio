package com.example.mohamed.portfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button item1, item2, item3, item4, item5, item6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        item1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This button will launch " + item1.getText() + " app!", Toast.LENGTH_LONG).show();
            }
        });
        item2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This button will launch " + item2.getText() + " app!", Toast.LENGTH_LONG).show();
            }
        });
        item3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This button will launch " + item3.getText() + " app!", Toast.LENGTH_LONG).show();
            }
        });
        item4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This button will launch " + item4.getText() + " app!", Toast.LENGTH_LONG).show();
            }
        });
        item5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This button will launch " + item5.getText() + " app!", Toast.LENGTH_LONG).show();
            }
        });
        item6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This button will launch " + item6.getText() + " app!", Toast.LENGTH_LONG).show();
            }
        });
    }

    void initUI() {
        item1 = (Button) findViewById(R.id.item1);
        item2 = (Button) findViewById(R.id.item2);
        item3 = (Button) findViewById(R.id.item3);
        item4 = (Button) findViewById(R.id.item4);
        item5 = (Button) findViewById(R.id.item5);
        item6 = (Button) findViewById(R.id.item6);
    }
}
