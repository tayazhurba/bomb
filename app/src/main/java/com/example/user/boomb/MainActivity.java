package com.example.user.boomb;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.view.View;
import android.widget.Button;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView bomb = (ImageView) findViewById(R.id.bomb);
        final ImageView fire = (ImageView) findViewById(R.id.fire);
        final ImageView fume = (ImageView) findViewById(R.id.fume);
        final Button btnStart = (Button) findViewById(R.id.btn_start);

        btnStart.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Animation animbomb = AnimationUtils.loadAnimation(
                        getApplicationContext(), R.anim.crazybomb);
                bomb.startAnimation(animbomb);
                Animation animfire = AnimationUtils.loadAnimation(
                        getApplicationContext(), R.anim.crazyfire);
                fire.startAnimation(animfire);
                Animation animfume = AnimationUtils.loadAnimation(
                        getApplicationContext(), R.anim.crazyfume);
                fume.startAnimation(animfume);
            }
        });
    }
}