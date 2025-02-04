package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView Text;
    private LinearLayout Layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Text = findViewById(R.id.textView);
        Layout = findViewById(R.id.Layout);
    }
    public void changeText(View view){
        Text.setText("Фон не изменился, но я поменялся");
        Layout.setBackgroundColor(getResources().getColor(R.color.bg));
    }
}