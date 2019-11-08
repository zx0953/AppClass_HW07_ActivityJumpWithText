package com.example.appclass_hw07_activityjumpwithtext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    EditText editText;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);

        Intent intent2 = getIntent();
        String sInput = intent2.getStringExtra("Data");
        if (sInput != null) {
            textView.setText(sInput);
        } else {
        }
    }
    public void BtnToA(View view){
        Intent intent = new Intent(this, MainActivity.class);
        String input = editText.getText().toString();
        intent.putExtra("Data",input);
        setResult(RESULT_OK,intent);
        finish();
    }
}
