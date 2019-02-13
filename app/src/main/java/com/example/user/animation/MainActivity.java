package com.example.user.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void blink(View view) {
        ImageView img=findViewById(R.id.iron);
        Animation animation=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
        img.startAnimation(animation);
    }

    public void clock(View view) {
        ImageView img=findViewById(R.id.iron);
        Animation animation=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.clockwise);
        img.startAnimation(animation);
    }

    public void fade(View view) {
        ImageView img=findViewById(R.id.iron);
        Animation animation=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
        img.startAnimation(animation);
        }

    public void zoom(View view) {
        ImageView img=findViewById(R.id.iron);
        Animation animation=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.myanimation);
        img.startAnimation(animation);
    }

    public void move(View view) {
        ImageView img=findViewById(R.id.iron);
        Animation animation=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
        img.startAnimation(animation);
    }

    public void slide(View view) {
        ImageView img=findViewById(R.id.iron);
        Animation animation=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide);
        img.startAnimation(animation);
    }
}
