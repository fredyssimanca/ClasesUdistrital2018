package com.example.freddyssimanca.clasesudistrital2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class ActSeekBar extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_seek_bar);

        ((SeekBar)findViewById(R.id.seekBar)).setOnSeekBarChangeListener(this);
    }
    @Override
    public void onProgressChanged(SeekBar seekBar, int val, boolean fromUser) {
        ((TextView)findViewById(R.id.textView6)).setText("Valor actual: " + val);
    }
    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        ((TextView)findViewById(R.id.textView7)).setText("Inicio en: " + seekBar.getProgress() );
    }
    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        ((TextView)findViewById(R.id.textView8)).setText("Se detuvo en: " + seekBar.getProgress() );
    }
}

