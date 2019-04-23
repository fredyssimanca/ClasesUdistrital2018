package com.example.freddyssimanca.clasesudistrital2018;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActOrientacion extends AppCompatActivity implements SensorEventListener {
    SensorManager sm;
    Sensor orientacion;
    TextView longitud, latitud, altitud;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_orientacion);
        longitud = (TextView)findViewById(R.id.textView18);
        latitud = (TextView)findViewById(R.id.textView19);
        altitud = (TextView)findViewById(R.id.textView20);
        sm = (SensorManager)getSystemService(SENSOR_SERVICE);
        orientacion = sm.getDefaultSensor(Sensor.TYPE_ORIENTATION);
        sm.registerListener((SensorEventListener)this, orientacion, SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        longitud.setText("Longitud  " + event.values[0]);
        latitud.setText("Latitud  " + event.values[1]);
        altitud.setText("Altitud  " + event.values[2]);
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}
