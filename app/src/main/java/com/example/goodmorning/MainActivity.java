package com.example.goodmorning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "GOOD MORNING!!", Toast.LENGTH_SHORT).show();
        text=findViewById(R.id.text);
        text.setText("JAI SHREE RAM ❤️🙏❤️");


    }
}