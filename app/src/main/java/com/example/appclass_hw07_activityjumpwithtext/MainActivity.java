package com.example.appclass_hw07_activityjumpwithtext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;
    String sInput;
    Intent intent2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK) {
            Log.d("Rui", "onActivityResult: ");
            sInput = data.getStringExtra("Data");
            if (sInput != null) {
                textView.setText(sInput);
            }else{
                Log.d("Rui", "NUll: ");
            }
        }
    }
    public void BtnToB (View view){
        Intent intent = new Intent(this, Main2Activity.class);
        String input = editText.getText().toString();
        intent.putExtra("Data", input);
        startActivityForResult(intent, 1);
    }
}
