package com.example.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;

public class Homescreen extends AppCompatActivity implements View.OnClickListener {

    private Button mButton;
    private Button nButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mButton = findViewById(R.id.button);
        mButton.setOnClickListener(this);

        nButton = (Button) findViewById(R.id.button2);
        nButton.setOnClickListener(this);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                OpenActivity1();
                break;


            case R.id.button2:
                OpenActivity2();
                break;
        }
    }

    public void OpenActivity1() {
        Intent A = new Intent(this, LoginActivity.class);
        startActivity(A);
    }


    public void OpenActivity2() {
        Intent intent = new Intent(this, SignupActivity.class);
        startActivity(intent);
    }


}

