package com.example.chadracdevspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutMeActivity4 extends AppCompatActivity {
    Button but2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me4);

        but2 = (Button)findViewById(R.id.but2);

        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutMeActivity4.this,MainActivity2.class);
                startActivity(intent);
            }
        });




    }
}