package com.example.freddyssimanca.clasesudistrital2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ActImageView extends AppCompatActivity implements View.OnClickListener {
    Button image1, image2;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_image_view);

        image1 = (Button) findViewById(R.id.button5);
        image2 = (Button) findViewById(R.id.button6);
        imageView = (ImageView) findViewById(R.id.imageView2);

        image1.setOnClickListener(this);
        image2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button5:
                imageView.setImageResource(R.drawable.encendido);
                break;
            case R.id.button6:
                imageView.setImageResource(R.drawable.apagada);
                break;
        }

    }
}
