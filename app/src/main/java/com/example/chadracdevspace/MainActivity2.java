package com.example.chadracdevspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView name;
    private Button Home;
    private Button Calculation;
    private Button About_Me;
    private Button My_Profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Home = findViewById(R.id.home);
        Calculation = findViewById(R.id.calcul);
        About_Me = findViewById(R.id.about);
        My_Profile = findViewById(R.id.profile);
        name = findViewById(R.id.text_name);

        String username = getIntent().getStringExtra("keyname");
        name.setText(username);

        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(intent);
            }
        });
        Calculation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,CalculationActivity3.class);
                startActivity(intent);
            }
        });
        About_Me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,AboutMeActivity4.class);
                startActivity(intent);
            }
        });
        My_Profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,MyProfileActivity5.class);
                startActivity(intent);
            }
        });
    }
}