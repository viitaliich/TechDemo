package com.example.techdemo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.text_view);

        String textFromTextView = textView.getText().toString();
        Log.d(TAG, "textFromTextView orig = [" + textFromTextView + "]");

        textView.setText("Set TextView");
        textFromTextView = textView.getText().toString();
        Log.d(TAG, "textFromTextView set = [" + textFromTextView + "]");
    }
}
