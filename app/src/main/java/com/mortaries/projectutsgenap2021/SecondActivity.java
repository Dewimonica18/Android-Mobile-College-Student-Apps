package com.mortaries.projectutsgenap2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button btn3 = (Button) findViewById(R.id.btnnext);
        Button btn4 = (Button) findViewById(R.id.btndatadirisaya);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(SecondActivity.this,ThirdActivity.class);
                startActivity(c);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d = new Intent(SecondActivity.this,FourthActivity.class);
                startActivity(d);
            }
        });
    }
}