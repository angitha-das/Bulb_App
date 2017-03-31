package com.example.angitha.bulb_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    boolean val=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.bulb_img);
        imageView.setImageResource(R.drawable.bulboff);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeImage();

            }
        });
    }
    void changeImage(){
        if(val){
            val=false;
            imageView.setImageResource(R.drawable.bulbon);
        }else{
            val=true;
            imageView.setImageResource(R.drawable.bulboff);
        }
    }

}