package ru.innovationcampus.samsung_s2_2023.module2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import ru.innovationcampus.samsung_s2_2023.R;

public class CalcActivity extends AppCompatActivity {
    EditText et1;
    EditText et2;
    EditText et3;
    EditText et4;
    Button add;
    Button sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);//тут мы добавляем на экран форму калькулятора
        et1 = this.findViewById(R.id.et1); //связываем переменную с объектом на экране
        et2 = this.findViewById(R.id.et2);
        et3 = this.findViewById(R.id.et3);
        et4 = this.findViewById(R.id.et4);
        add = this.findViewById(R.id.add);
        sub = this.findViewById(R.id.sub);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(et1.getText().toString());
                int b = Integer.parseInt(et2.getText().toString());
                int a2 = Integer.parseInt(et3.getText().toString());
                int b2 = Integer.parseInt(et4.getText().toString());
                Fraction f1 = new Fraction(a, b);
                Fraction f2 = new Fraction(a2, b2);
                Fraction sum = f1.add(f2);
                Toast.makeText(CalcActivity.this, sum.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "on start", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "on pause", Toast.LENGTH_SHORT).show();
    }
}