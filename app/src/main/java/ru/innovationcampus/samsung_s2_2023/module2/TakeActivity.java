package ru.innovationcampus.samsung_s2_2023.module2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import ru.innovationcampus.samsung_s2_2023.R;

public class TakeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take);
        Intent result = new Intent();
        result.putExtra("resultMessage", "TODO: from user screen");
        setResult(1, result);
        finish();
    }
}