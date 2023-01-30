package com.example.spring_crud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    /**
     * onCreateメソッド
     * 画面遷移や値渡しなどの処理を記述
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.index);


    }

    // 画面遷移処理
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, List.class);
        startActivity(intent);
    }
}