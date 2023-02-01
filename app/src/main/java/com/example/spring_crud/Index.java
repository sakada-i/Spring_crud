package com.example.spring_crud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

public class Index extends AppCompatActivity {

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
        // インテントの定義
        Intent intent = new Intent(Index.this, optionMenu.class);

        // エラーメッセージ
        String errMessage = "";
        // テキストボックス取得
        EditText personName = findViewById(R.id.personName);
        EditText password = findViewById(R.id.password);

        /**
         * エラーフラグ判定
         *  0: 無し
         *  1: 社員ID未入力
         *  2: パスワード未入力
         *  3: 社員が存在するか判定
         */
        int errFlg = 0;
        if (personName.getText().toString().isEmpty()) {
            errMessage = "社員IDを入力してください。";
            errFlg = 1;
        } else if (password.getText().toString().isEmpty()) {
            errMessage = "パスワードを入力してください。";
            errFlg = 2;
        }

        switch (errFlg) {
            case 1:
                personName.setError(errMessage);
                break;
            case 2:
                password.setError(errMessage);
                break;
        }

        if (errFlg == 0) {
            /**
             * 画面遷移処理
             * @param name 値のキー
             * @param value 値
             */
            intent.putExtra("TextData", "indexから送信した文字列です。");
            startActivity(intent);
        }
    }

    public void showSnack_bar(View view) {
//        Snackbar.make(view, "メッセージを表示すぅいます。", Snackbar.LENGTH_LONG)
//                .setAction("ボタン", new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        // ボタンを押した時の処理
//                    }
//                })
//                .show();
        // setBackgroundTint: 背景色の指定
        // setTextColor: 文字色の指定
        Snackbar.make(view, "メッセージ", Snackbar.LENGTH_LONG)
                .setBackgroundTint(getResources().getColor(R.color.err_message_color))
                .show();
    }

}