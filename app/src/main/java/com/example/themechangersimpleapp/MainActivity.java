package com.example.themechangersimpleapp;



import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonDark, buttonRead;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonDark = findViewById(R.id.btnDark);
        buttonRead = findViewById(R.id.btnRead);
        View linear = findViewById(R.id.linearlayout);

     buttonRead.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {

             linear.setBackgroundResource(R.color.Yellow);
         }
     });

        buttonDark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                linear.setBackgroundResource(R.color.black);
            }
        });

    }
}