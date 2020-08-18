package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //OnclickButtonLister();

    }
    Button btn;
    EditText t1;
    EditText t2;

    @Override
    protected void onResume() {
        super.onResume();
        btn = findViewById(R.id.btnOK2);
        t1 = findViewById(R.id.noin3);
        t2 = findViewById(R.id.noin);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast toast;
                Context con = getApplicationContext();
                CharSequence seq = "Sending message...";
                int due = Toast.LENGTH_SHORT;
                toast = Toast.makeText(con,seq,due);
                toast.setGravity(Gravity.CENTER_VERTICAL, 0,0);//place the msg
                toast.show();
                Intent intent = new Intent(MainActivity.this , SecondActivity.class);
                intent.putExtra("first", t1.getText().toString());
                intent.putExtra("second",t2.getText().toString());
                startActivity(intent);

            }
        });
    }



}