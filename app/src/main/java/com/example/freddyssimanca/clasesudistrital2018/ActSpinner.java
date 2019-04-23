package com.example.freddyssimanca.clasesudistrital2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ActSpinner extends AppCompatActivity {
    TextView textView;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_spinner);
        spinner = (Spinner) findViewById(R.id.spinner);
        textView = (TextView) findViewById(R.id.textView5);

        List ciudades = new ArrayList();
        ciudades.add("--Seleccione--");
        ciudades.add("Arauca");
        ciudades.add("Bogotá");
        ciudades.add("Barranquilla");
        ciudades.add("Bucaramanga");
        ciudades.add("Cali");
        ciudades.add("Cucuta");

        ArrayAdapter arrayAdapter =
                new ArrayAdapter(this, android.R.layout.select_dialog_item, ciudades);
        arrayAdapter.setDropDownViewResource(android.R.layout.select_dialog_item);
        spinner.setAdapter(arrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                textView.setText("Seleccionaste: " + spinner.getSelectedItem());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
