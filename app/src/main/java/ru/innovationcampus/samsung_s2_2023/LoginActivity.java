package ru.innovationcampus.samsung_s2_2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import ru.innovationcampus.samsung_s2_2023.module2.NewsActivity;

public class LoginActivity extends AppCompatActivity {
    EditText loginET;
    EditText pwdET = null;
    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //ничего на экране нет
        setContentView(R.layout.activity_login);
        //теперь есть
        loginET = this.findViewById(R.id.loginVal);
        pwdET = this.findViewById(R.id.pwdET);
        loginBtn = this.findViewById(R.id.loginBtn);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            int randomField;
            @Override
            public void onClick(View view) {
                String login = loginET.getText().toString();
                String pwd = pwdET.getText().toString();
                if (login.equals("hello") && pwd.equals("world")) {
                    Toast.makeText(LoginActivity.this, "you hack pentagon", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getBaseContext(), NewsActivity.class);
                    startActivity(i);
                } else {
                    //Toast c негативным сообщением
                }
            }
        });
    }
}