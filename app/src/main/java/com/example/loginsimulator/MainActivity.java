package com.example.loginsimulator;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final String rightId = "abc";
        final String rightPassword = "1234";
        // 아이디랑 비밀번호 설정

        final EditText editText = findViewById(R.id.ET_Id);
        final EditText editText1 = findViewById(R.id.ET_password);
        Button button = findViewById(R.id.BTN_Login);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputId = editText.getText().toString();
                // Id 입력값 가져와서 inputId에 저장
                String inputPassword = editText1.getText().toString();
                // Password 입력값 가져와서 inputPassword 에 저장

                if (inputId.trim().equals(rightId) && inputPassword.trim().equals(rightPassword)){
                    // 입력된 아이디랑 비밀번호가 맞는지 확인

                    ConstraintLayout layout_main = findViewById(R.id.layoutMain);
                    Drawable.ConstantState cid = layout_main.getBackground().getConstantState();

                    Intent intent = new Intent(MainActivity.this,subActivity.class);
                    startActivityForResult(intent,101);

                } else {Toast.makeText(getApplicationContext(), "Wrong!", Toast.LENGTH_SHORT).show();
            }
        }
    });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        ConstraintLayout layout_main = findViewById(R.id.layoutMain);

        if (requestCode == 101 && resultCode == RESULT_OK && data != null) {

            String returnColor = data.getStringExtra("RETURN_COLOR");

            if (returnColor.equals("almost")) {
                layout_main.setBackgroundResource(R.drawable.almost);
            } else if (returnColor.equals("moor")) {
                layout_main.setBackgroundResource(R.drawable.moor);
            } else if (returnColor.equals("calmdarya")) {
                layout_main.setBackgroundResource(R.drawable.calmdarya);
            }
        }
    }
}