package com.example.freddyssimanca.clasesudistrital2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActEnviar extends AppCompatActivity implements View.OnClickListener {
    Button button;
    EditText nombres, apellidos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_enviar);
        button = (Button) findViewById(R.id.btncontinuar);
        nombres = (EditText) findViewById(R.id.TxtNombres);
        apellidos = (EditText) findViewById(R.id.TxtApellidos);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btncontinuar:
                Intent intent = new Intent(this, ActRecibir.class);
                intent.putExtra("Nombres",nombres.getText());
                intent.putExtra("Apellidos",apellidos.getText());
                startActivity(intent);
                break;
            default:
                break;

        }
    }
}
