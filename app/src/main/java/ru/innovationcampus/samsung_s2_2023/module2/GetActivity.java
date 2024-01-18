package ru.innovationcampus.samsung_s2_2023.module2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import ru.innovationcampus.samsung_s2_2023.R;

public class GetActivity extends AppCompatActivity {
    TextView messageTV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get);
        messageTV = findViewById(R.id.messageTV);
        Intent intent = getIntent();
        messageTV.setText(intent.getStringExtra("message"));
    }
}