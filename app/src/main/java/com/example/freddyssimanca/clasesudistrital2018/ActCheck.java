package com.example.freddyssimanca.clasesudistrital2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class ActCheck extends AppCompatActivity implements View.OnClickListener {
    Button button;
    CheckBox ciclismo, futbol, natacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_check);
        button = (Button) findViewById(R.id.button4);
        ciclismo = (CheckBox) findViewById(R.id.checkBox);
        futbol = (CheckBox) findViewById(R.id.checkBox2);
        natacion = (CheckBox) findViewById(R.id.checkBox3);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button4:
                StringBuffer cad = new StringBuffer();
                cad.append(" Ciclismo: ").append(ciclismo.isChecked());
                cad.append(" Futbol: ").append(futbol.isChecked());
                cad.append(" Natacion: ").append(natacion.isChecked());
                Toast.makeText(getApplicationContext(), cad, Toast.LENGTH_LONG).show();
                break;
            default:
                break;
        }

    }
}
