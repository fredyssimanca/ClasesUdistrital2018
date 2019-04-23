package com.example.freddyssimanca.clasesudistrital2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ActRecibir extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_recibir);
        textView = (TextView) findViewById(R.id.textView);

        Intent paquete = getIntent();
        Bundle recogedor = paquete.getExtras();
        if (recogedor!=null){
           // textView.setText("Hola " + recogedor.get("Nombres") + " " + recogedor.get("Apellidos"));
            Toast.makeText(this, "Hola " + recogedor.get("Nombres") + " " + recogedor.get("Apellidos"),
                    Toast.LENGTH_LONG).show();
        }

    }
}
