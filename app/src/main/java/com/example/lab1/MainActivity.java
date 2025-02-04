package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView Text;
    private ConstraintLayout layout;
    boolean click = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Text = findViewById(R.id.textView);
        layout = findViewById(R.id.Layout);
    }
    public void changeText(View view){
        if (click == false) {
            Text.setText("Доброй ночи!");
            Text.setTextColor(ContextCompat.getColor(this, R.color.white));
            Toast.makeText(getApplicationContext(), "Вы включили темную тему", Toast.LENGTH_SHORT).show();
            layout.setBackgroundColor(ContextCompat.getColor(this, R.color.bg));
            click = true;
        } else if (click == true) {
            Text.setText("Доброе утро");
            Text.setTextColor(ContextCompat.getColor(this, R.color.black));
            Toast.makeText(getApplicationContext(), "Вы включили светлую тему", Toast.LENGTH_SHORT).show();
            layout.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
            click = false;
        }
    }
}