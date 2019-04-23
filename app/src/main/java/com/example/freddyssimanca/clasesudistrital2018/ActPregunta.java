package com.example.freddyssimanca.clasesudistrital2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

public class ActPregunta extends AppCompatActivity {
    CheckBox opcionMostrar;
    TextView nombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_pregunta);
        opcionMostrar = (CheckBox)findViewById(R.id.checkBox5);
        nombre = (TextView) findViewById(R.id.textView11);
        opcionMostrar.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (opcionMostrar.isChecked()){
                    nombre.setVisibility(View.VISIBLE);
                }else {
                    nombre.setVisibility(View.GONE);
                }
            }
        });
    }
}
