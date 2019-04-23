package com.example.freddyssimanca.clasesudistrital2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActMenuSensores extends AppCompatActivity implements View.OnClickListener {
    Button button1, button2, button3, button4, button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_menu_sensores);

        button1 = (Button) findViewById(R.id.button13);
        button2 = (Button) findViewById(R.id.button14);
        button3 = (Button) findViewById(R.id.button15);
        button4 = (Button) findViewById(R.id.button16);
        button5 = (Button) findViewById(R.id.button17);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button13:
                Intent nuevo = new Intent(this, ActTemperatura.class);
                startActivity(nuevo);
                break;
            case R.id.button14:
                Intent nuevo1 = new Intent(this, ActLuz.class);
                startActivity(nuevo1);
                break;
            case R.id.button15:
                Intent nuevo2 = new Intent(this, ActProximidad.class);
                startActivity(nuevo2);
                break;
            case R.id.button16:
                Intent nuevo3 = new Intent(this, ActAcelerometro.class);
                startActivity(nuevo3);
                break;
            case R.id.button17:
                Intent nuevo4 = new Intent(this, ActOrientacion.class);
                startActivity(nuevo4);
                break;
        }

    }
}
