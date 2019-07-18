package com.iss.marshmellowapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toolbar;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView totalView;
    EditText percentageText;
    EditText numberText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        totalView = (TextView) findViewById(R.id.totalTextView);
        percentageText = (EditText) findViewById(R.id.editTextPercentage);
        numberText = (EditText) findViewById(R.id.enterNumber);

        Button calc = findViewById(R.id.button);
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float percentage = Float.parseFloat(percentageText.getText().toString());
                float dec = percentage/ 100;
                float result =  dec * Float.parseFloat(numberText.getText().toString());
                totalView.setText(Float.toString(result));
            }
        });

    }

}
