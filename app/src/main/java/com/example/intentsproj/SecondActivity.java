package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Intent intent = getIntent();

        String t1 = intent.getStringExtra("first");
        String t2 = intent.getStringExtra("second");

        EditText t3;
        EditText t4;

        t3 = findViewById(R.id.noin6);
        t4 = findViewById(R.id.noed);

        t3.setText(t1);
        t4.setText(t2);

        TextView t6;
        TextView t7;

        t6 = findViewById(R.id.t1);
        t7 = findViewById(R.id.t2);

        t6.setText(t1);
        t7.setText(t2);
    }

    Button btn1,btn2,btn3,btn4;
    @Override
    protected void onResume() {
        super.onResume();

        btn1 = findViewById(R.id.btplus);
        btn2 = findViewById(R.id.btndivi);
        btn3 = findViewById(R.id.btnmulti);
        btn4 = findViewById(R.id.btns);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = getIntent();

                String t1 = intent.getStringExtra("first");
                String t2 = intent.getStringExtra("second");

                int a = Integer.parseInt(t1);
                int b = Integer.parseInt(t2);

                int c = a + b;

                TextView t = findViewById(R.id.tt);
                t.setText("+");

                TextView tt = findViewById(R.id.t4);
                tt.setText(Integer.toString(c));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = getIntent();

                String t1 = intent.getStringExtra("first");
                String t2 = intent.getStringExtra("second");

                int a = Integer.parseInt(t1);
                int b = Integer.parseInt(t2);

                int c = a / b;

                TextView t = findViewById(R.id.tt);
                t.setText("/");

                TextView tt = findViewById(R.id.t4);
                tt.setText(Integer.toString(c));
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = getIntent();

                String t1 = intent.getStringExtra("first");
                String t2 = intent.getStringExtra("second");

                int a = Integer.parseInt(t1);
                int b = Integer.parseInt(t2);

                int c = a * b;

                TextView t = findViewById(R.id.tt);
                t.setText("*");

                TextView tt = findViewById(R.id.t4);
                tt.setText(Integer.toString(c));
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = getIntent();

                String t1 = intent.getStringExtra("first");
                String t2 = intent.getStringExtra("second");

                int a = Integer.parseInt(t1);
                int b = Integer.parseInt(t2);

                int c = a - b;

                TextView t = findViewById(R.id.tt);
                t.setText("-");

                TextView tt = findViewById(R.id.t4);
                tt.setText(Integer.toString(c));
            }
        });



    }
}