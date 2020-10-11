package com.example.loginsimulator;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import static java.util.logging.Logger.global;

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

        ConstraintLayout layout_sub = findViewById(R.id.layoutSub);

        int cid = view.getId();

        if (cid == R.id.BTN_Almost) {
            layout_sub.setBackgroundResource(R.drawable.almost);
        } else if (cid == R.id.BTN_Moor) {
            layout_sub.setBackgroundResource(R.drawable.moor);
        }else if (cid == R.id.BTN_Calmdarya) {
            layout_sub.setBackgroundResource(R.drawable.calmdarya);
        }

    }

    @Override
    public void onBackPressed() {
        // 뒤로가기 버튼 눌렀을 때 실행되는 코드

        ConstraintLayout layout_sub = findViewById(R.id.layoutSub);

        Drawable.ConstantState cid = layout_sub.getBackground().getConstantState();

        Intent intent = new Intent();
        // Intent()안에 아무것도 안 적어도 되는 이유
        // 뒤로가기 하면 자동으로 원래 있던 activity로 돌아가서

        if (cid.equals(getResources().getDrawable(R.drawable.almost).getConstantState())) {
            intent.putExtra("RETURN_COLOR", "almost");
            // drawable 비교에는 == 못 씀
        } else if ((cid.equals(getResources().getDrawable(R.drawable.moor).getConstantState()))) {
            intent.putExtra("RETURN_COLOR", "moor");
        } else if ((cid.equals(getResources().getDrawable(R.drawable.calmdarya).getConstantState()))) {
            intent.putExtra("RETURN_COLOR", "calmdarya");
        }

        setResult(RESULT_OK, intent);
        // 멀쩡하다는 거 보증

        super.onBackPressed(); // finish()의 효과?
    }

}
