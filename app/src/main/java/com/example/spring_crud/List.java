package com.example.spring_crud;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class List extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        Intent intent = getIntent();
        String text = intent.getStringExtra("TextData");
        TextView textView1 = (TextView)findViewById(R.id.gettext);

        textView1.setText(text);
    }
}
