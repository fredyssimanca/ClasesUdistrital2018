package com.example.freddyssimanca.clasesudistrital2018;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class ActMediaController extends AppCompatActivity implements View.OnClickListener {
    CheckBox checkBox;
    TextView textView;
    Button btnPlay, btnStop;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_media_controller);

        btnPlay = (Button) findViewById(R.id.button7);
        btnStop = (Button) findViewById(R.id.button8);
        btnPlay.setOnClickListener(this);
        btnStop.setOnClickListener(this);
        mp = MediaPlayer.create(this, R.raw.cancion);
        checkBox = (CheckBox) findViewById(R.id.checkBox4);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked==true){
                    textView.setVisibility(View.VISIBLE);
                } else {
                    textView.setVisibility(View.INVISIBLE);
                }

            }
        });
    }
    @Override
    public void onClick(View v) {
            switch (v.getId()){
                case R.id.button7:
                    mp.start();
                    break;
                case R.id.button8:
                    mp.stop();
                    break;
            }

    }
}
