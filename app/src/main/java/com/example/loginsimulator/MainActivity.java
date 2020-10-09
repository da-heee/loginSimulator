package com.example.loginsimulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
        final String rightPassword = "abc";
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

                    Intent intent = new Intent(MainActivity.this,subActivity.class);
                    startActivityForResult(intent,101);
                } else {Toast.makeText(getApplicationContext(), "Wrong!", Toast.LENGTH_SHORT).show();

            }
        }
    });
    }
}