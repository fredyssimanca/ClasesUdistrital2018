package com.example.freddyssimanca.clasesudistrital2018;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActMenuBD extends AppCompatActivity {
    EditText doc, nom, cor;
    Button btninsert, btnselect, btndelete, btnupdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_menu_bd);
        doc = (EditText)findViewById(R.id.editText2);
        nom = (EditText)findViewById(R.id.editText3);
        cor = (EditText)findViewById(R.id.editText4);
        btninsert = (Button)findViewById(R.id.button20);
        btnselect = (Button)findViewById(R.id.button21);
        btndelete = (Button)findViewById(R.id.button22);
        btnupdate = (Button)findViewById(R.id.button23);

        btninsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Usuarios userdb = new Usuarios(getApplicationContext(), "DBUsuarios", null, 1);
                SQLiteDatabase db = userdb.getWritableDatabase();
                if (db!=null){
                    String d = doc.getText().toString();
                    String n = nom.getText().toString();
                    String c = cor.getText().toString();
                    db.execSQL("INSERT INTO Usuarios(documento, nombres, correo) " +
                            "VALUES("+ d + ",'" + n + "','" + c + "')");
                    Toast.makeText(getApplicationContext(),"Ingreso exitoso",Toast.LENGTH_LONG).show();
                    db.close();
                }else{
                    Toast.makeText(getApplicationContext(),"Error",Toast.LENGTH_LONG).show();
                }
            }
        });

        btnselect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int aux = Integer.parseInt(doc.getText().toString());
                Usuarios userdb = new Usuarios(getApplicationContext(), "DBUsuarios", null, 1);
                SQLiteDatabase db = userdb.getWritableDatabase();
                Cursor c = db.rawQuery("SELECT * FROM Usuarios WHERE documento=" + aux, null );
                if (c.moveToFirst()){
                    nom.setText(c.getString(1));
                    cor.setText(c.getString(2));
                    Toast.makeText(getApplicationContext(),"Encontrado",Toast.LENGTH_LONG).show();
                    db.close();
                }else{
                    Toast.makeText(getApplicationContext(),"No encontrado",Toast.LENGTH_LONG).show();
                }
            }
        });

        btndelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Usuarios userdb = new Usuarios(getApplicationContext(), "DBUsuarios", null, 1);
                SQLiteDatabase db = userdb.getWritableDatabase();
                if (db!=null){
                    int aux = Integer.parseInt(doc.getText().toString());
                    db.execSQL("DELETE FROM Usuarios WHERE documento = " + aux);
                    Toast.makeText(getApplicationContext(), "Registro eliminado", Toast.LENGTH_LONG).show();
                    doc.setText("");
                    nom.setText("");
                    cor.setText("");
                    db.close();
                }
            }
        });

        btnupdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Usuarios userdb = new Usuarios(getApplicationContext(), "DBUsuarios", null, 1);
                SQLiteDatabase db = userdb.getWritableDatabase();
                if (db!=null){
                    int aux = Integer.parseInt(doc.getText().toString());
                    String nombre = nom.getText().toString();
                    String email = cor.getText().toString();
                    db.execSQL("UPDATE Usuarios SET nombres='" + nombre + "', correo='" + email + "' WHERE documento = " + aux);
                    Toast.makeText(getApplicationContext(), "Registro actualizado", Toast.LENGTH_LONG).show();
                    db.close();
                }
            }
        });

    }
}
