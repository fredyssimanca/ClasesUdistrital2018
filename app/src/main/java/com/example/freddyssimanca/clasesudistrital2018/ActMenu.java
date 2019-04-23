package com.example.freddyssimanca.clasesudistrital2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class ActMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int opc = item.getItemId();
        switch (opc){
            case R.id.opcion1:
                Toast.makeText(getApplicationContext(), "Opcion 1", Toast.LENGTH_LONG).show();
                break;
            case R.id.opcion2:
                Toast.makeText(getApplicationContext(), "Opcion 2", Toast.LENGTH_LONG).show();
                break;
            case R.id.opcion3:
                Toast.makeText(getApplicationContext(), "Opcion 3", Toast.LENGTH_LONG).show();
                break;
            case R.id.opcion4:
                Toast.makeText(getApplicationContext(), "Opcion 4", Toast.LENGTH_LONG).show();
                break;
        }
        return true;
    }

}
