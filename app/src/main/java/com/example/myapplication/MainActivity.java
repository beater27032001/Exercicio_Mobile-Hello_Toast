package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView number = findViewById(R.id.textView);

        number.setText("0");

        Button btCount = findViewById(R.id.btCount);


        btCount.setOnClickListener(view -> {
            contador +=1;
            number.setText(String.valueOf(contador));
        });

        Button btTotast = findViewById(R.id.btToast);

        btTotast.setOnClickListener(view -> {
            Toast.makeText(this, "Hello Toast", Toast.LENGTH_LONG).show();
        });
    }
}