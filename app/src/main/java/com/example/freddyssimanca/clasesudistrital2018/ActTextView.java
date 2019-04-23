package com.example.freddyssimanca.clasesudistrital2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActTextView extends AppCompatActivity implements View.OnClickListener {
    EditText nombres;
    Button saludar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_text_view);

        nombres = (EditText) findViewById(R.id.TxtNombres);
        saludar = (Button) findViewById(R.id.BtnSaludar);
        saludar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.BtnSaludar:
                if (nombres.length()>0){
                    ((TextView)findViewById(R.id.Txtmensaje)).setText("Hola " + nombres.getText() );
                }else {
                    ((TextView)findViewById(R.id.Txtmensaje)).setText("Ingresa un nombre");
                }
                break;
        }

    }
}
