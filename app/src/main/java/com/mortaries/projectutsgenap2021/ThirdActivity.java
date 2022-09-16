package com.mortaries.projectutsgenap2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Button btn5 = (Button) findViewById(R.id.btnnext2);
        Button btn6 = (Button) findViewById(R.id.btnback);
        Button btn7 = (Button) findViewById(R.id.btnmainmenu);

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent e = new Intent(ThirdActivity.this,FourthActivity.class);
                startActivity(e);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent f = new Intent(ThirdActivity.this,SecondActivity.class);
                startActivity(f);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent g = new Intent(ThirdActivity.this,MainActivity.class);
                startActivity(g);
            }
        });
    }
}