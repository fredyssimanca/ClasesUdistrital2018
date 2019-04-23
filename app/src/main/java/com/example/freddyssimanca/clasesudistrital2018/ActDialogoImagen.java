package com.example.freddyssimanca.clasesudistrital2018;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActDialogoImagen extends AppCompatActivity implements View.OnClickListener {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_dialogo_imagen);
        button = (Button)findViewById(R.id.button11);
        button.setOnClickListener(this);
    }
    protected Dialog onCreateDialog(int id){
        Dialog dialog= null;
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder = builder.setIcon(R.drawable.ios);
        builder = builder.setTitle("Mensaje personalizado");
        builder = builder.setPositiveButton("SI", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        dialog = builder.create();
        return dialog;
    }
    @Override
    public void onClick(View v) {
        onCreateDialog(0).show();
    }
}
