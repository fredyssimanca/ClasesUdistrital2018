package com.example.freddyssimanca.clasesudistrital2018;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActIntens extends AppCompatActivity {
    Button btnllamar;
    EditText numero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_intens);

        btnllamar = (Button) findViewById(R.id.button12);
        numero = (EditText) findViewById(R.id.editText);

        btnllamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                implicito();
            }
        });

    }

    public void implicito(){
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + numero.getText()));
        startActivity(intent);
    }
}
