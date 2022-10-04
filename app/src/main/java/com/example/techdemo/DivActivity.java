package com.example.techdemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;

public class DivActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.div_activity);

        TextView textViewEnterA = (TextView) findViewById(R.id.textViewEnterA);
        textViewEnterA.setText("Enter A: ");

        TextView textViewEnterB = (TextView) findViewById(R.id.textViewEnterB);
        textViewEnterB.setText("Enter B: ");

        TextInputLayout editTextEnterA = (TextInputLayout )findViewById(R.id.textFieldEnterA);
        TextInputLayout editTextEnterB = (TextInputLayout )findViewById(R.id.textFieldEnterB);

        Button btnRes = (Button)findViewById(R.id.btnRes);
        Button btnRet = (Button)findViewById(R.id.btnReturn);

        btnRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strA = editTextEnterA.getEditText().getText().toString();
                String strB = editTextEnterB.getEditText().getText().toString();
                String result = "Error";

                if (!strA.isEmpty() && !strB.isEmpty())
                {
                    int valA = Integer.valueOf(strA);
                    int valB = Integer.valueOf(strB);
                    result = String.valueOf(NativeLibrary.Div(valA, valB));

                }
                btnRes.setText(result);
            }
        });

        btnRet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DivActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
