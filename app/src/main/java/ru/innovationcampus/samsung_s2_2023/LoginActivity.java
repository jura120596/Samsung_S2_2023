package ru.innovationcampus.samsung_s2_2023;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    EditText loginET = null;
    EditText pwdET = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //ничего на экране нет
        setContentView(R.layout.activity_login);
        //теперь есть
        loginET = this.findViewById(R.id.loginVal);
        System.out.println(loginET.getText());//увидим на экране пустую строку
    }
}