package com.example.loginsimulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class subActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Button buttonAlmost = findViewById(R.id.BTN_Almost);
        Button buttonMoor = findViewById(R.id.BTN_Moor);
        Button buttonCalmdarya = findViewById(R.id.BTN_Calmdarya);

        buttonAlmost.setOnClickListener(this);
        buttonMoor.setOnClickListener(this);
        buttonCalmdarya.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int cid = view.getId();

        if (cid == R.id.BTN_Almost) {
            Toast.makeText(getApplicationContext(), "Almost", Toast.LENGTH_SHORT).show();}
        if (cid == R.id.BTN_Moor) {
            Toast.makeText(getApplicationContext(), "Moor", Toast.LENGTH_SHORT).show();}
        if (cid == R.id.BTN_Calmdarya) {
            Toast.makeText(getApplicationContext(), "Calmdarya", Toast.LENGTH_SHORT).show();}

    }


}
