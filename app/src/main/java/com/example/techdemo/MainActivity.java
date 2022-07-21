package com.example.techdemo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.HapticFeedbackConstants;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: [STARTED]");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.text_view);
        String textFromTextView = textView.getText().toString();
        Log.d(TAG, "textFromTextView orig = [" + textFromTextView + "]");

        textView.setText("Set TextView");
        textFromTextView = textView.getText().toString();
        Log.d(TAG, "textFromTextView set = [" + textFromTextView + "]");

        Button btnAdd = (Button)findViewById(R.id.btnAdd);
        Button btnSub = (Button)findViewById(R.id.btnSubtract);
        Button btnMul = (Button)findViewById(R.id.btnMultiply);
        Button btnDiv = (Button)findViewById(R.id.btnDivide);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = btnAdd.getText().toString();
                Toast.makeText(MainActivity.this, "Clicked " + name, Toast.LENGTH_SHORT).show();
                textView.setText("Last clicked button: " + name);
                btnAdd.performHapticFeedback(HapticFeedbackConstants.KEYBOARD_TAP);
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = btnSub.getText().toString();
                Toast.makeText(MainActivity.this, "Clicked " + name, Toast.LENGTH_SHORT).show();
                textView.setText("Last clicked button: " + name);
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = btnMul.getText().toString();
                Toast.makeText(MainActivity.this, "Clicked " + name, Toast.LENGTH_SHORT).show();
                textView.setText("Last clicked button: " + name);
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = btnDiv.getText().toString();
                Toast.makeText(MainActivity.this, "Clicked " + name, Toast.LENGTH_SHORT).show();
                textView.setText("Last clicked button: " + name);
            }
        });

        Log.d(TAG, "onCreate: [FINISHED]");
    }
}
