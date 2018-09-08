package com.example.sierrachang.electrictransportationconvertor;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RadioButton;



public class MainActivity extends AppCompatActivity {
    TextView final_result;
    EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final_result = (TextView)findViewById(R.id.timeDisplay);


    }

    public void SelectThis (View view){

        input = (EditText)findViewById(R.id.distanceDisplay);
        double num = Double.parseDouble(input.getText().toString());


        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()){

            case R.id.walking:
                final_result.setText(Double.toString(num / 3.1 * 60));
                break;

            case R.id.boosted:
                final_result.setText(Double.toString(num / 18 * 60));
                break;

            case R.id.evolve:
                final_result.setText(Double.toString(num / 26 * 60));
                break;

            case R.id.segway:
                final_result.setText(Double.toString(num / 12.5 * 60));
                break;

            case R.id.hoverboard:
                final_result.setText(Double.toString(num / 8 * 60));
                break;
        }
    }
}
