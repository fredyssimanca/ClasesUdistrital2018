package com.example.freddyssimanca.clasesudistrital2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ActRadioGrup extends AppCompatActivity {
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_radio_grup);
        radioGroup = (RadioGroup) findViewById(R.id.rghijos);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.rbsi){
                    Toast.makeText(getApplicationContext(), "Si tiene hijos",Toast.LENGTH_LONG).show();
                } else if (checkedId == R.id.rbno){
                    Toast.makeText(getApplicationContext(), "No tiene hijos",Toast.LENGTH_LONG).show();
                } else if (checkedId == R.id.rbnsnr){
                    Toast.makeText(getApplicationContext(), "No lo sabe",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
