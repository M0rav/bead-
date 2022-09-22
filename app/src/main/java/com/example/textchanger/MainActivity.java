package com.example.textchanger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.dialog.InsetDialogOnTouchListener;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout layout;
    private EditText editTextInput;
    private Button buttonSmaller;
    private Button buttonBigger;
    private Button buttonRndColor;
    private TextView textShower;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        buttonSmaller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String szoveg = editTextInput.getText().toString().toLowerCase();
                textShower.setText(szoveg);
            }
        });

        buttonBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String szoveg = editTextInput.getText().toString().toLowerCase();
                textShower.setText(szoveg);

            }
        });
        buttonRndColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
    private void init() {
        layout = findViewById(R.id.layout);
        editTextInput = findViewById(R.id.editTextInput);
        buttonSmaller = findViewById(R.id.buttonSmaller);
        buttonBigger = findViewById(R.id.buttonBigger);
        buttonRndColor = findViewById(R.id.buttonRndColor);
        textShower = findViewById(R.id.textShower);
    }

}