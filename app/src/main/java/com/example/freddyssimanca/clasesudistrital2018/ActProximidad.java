package com.example.freddyssimanca.clasesudistrital2018;

import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ActProximidad extends AppCompatActivity implements SensorEventListener {
    LinearLayout fondo;
    SensorManager sm;
    Sensor proximidad;
    TextView prox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_proximidad);
        fondo = (LinearLayout) findViewById(R.id.linearLayout);
        prox = (TextView)findViewById(R.id.textView14);
        sm = (SensorManager)getSystemService(SENSOR_SERVICE);
        proximidad = sm.getDefaultSensor(Sensor.TYPE_PROXIMITY);
        sm.registerListener((SensorEventListener)this,proximidad, SensorManager.SENSOR_DELAY_FASTEST);
    }
    @Override
    public void onSensorChanged(SensorEvent event) {
        float valor = event.values[0];
        prox.setText(String.valueOf(valor));
        if (valor<=5){
            fondo.setBackgroundColor(Color.CYAN);
        }else{
            fondo.setBackgroundColor(Color.RED);
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
    }
}
