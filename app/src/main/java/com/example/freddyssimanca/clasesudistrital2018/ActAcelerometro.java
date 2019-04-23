package com.example.freddyssimanca.clasesudistrital2018;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActAcelerometro extends AppCompatActivity implements SensorEventListener {
    SensorManager sm;
    Sensor acelerometro;
    TextView posX, posY, posZ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_acelerometro);
        posX = (TextView)findViewById(R.id.textView15);
        posY = (TextView)findViewById(R.id.textView16);
        posZ = (TextView)findViewById(R.id.textView17);
        sm = (SensorManager)getSystemService(SENSOR_SERVICE);
        acelerometro = sm.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        sm.registerListener((SensorEventListener)this,acelerometro, SensorManager.SENSOR_DELAY_GAME);
    }
    @Override
    public void onSensorChanged(SensorEvent event) {
        posX.setText("Valor en x: " + event.values[0]);
        posY.setText("Valor en y: " + event.values[1]);
        posZ.setText("Valor en z: " + event.values[2]);
    }
    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}
