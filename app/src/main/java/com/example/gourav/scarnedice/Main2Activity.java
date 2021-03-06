package com.example.gourav.scarnedice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {


    Animation myAnimation;

    Button Seasy,Smed,Measy,Mmed,Bback;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        myAnimation = AnimationUtils.loadAnimation(this , R.anim.myanimation);

        Seasy = (Button) findViewById(R.id.Splayeasy);
        Smed = (Button) findViewById(R.id.Splaymod);
        Measy =(Button) findViewById(R.id.Mplayeasy);
        Mmed = (Button) findViewById(R.id.Mplaymod);
        Bback =(Button) findViewById(R.id.Back1);

        TextView sp = (TextView)findViewById(R.id.Splay);
        TextView mp = (TextView)findViewById(R.id.Mulplay);

        sp.startAnimation(myAnimation);
        mp.startAnimation(myAnimation);

        Seasy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(Main2Activity.this,Splayeasy.class);
                startActivity(intent);
            }
        });

        Smed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(Main2Activity.this,Splaymed.class);
                startActivity(intent);
            }
        });

        Measy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(Main2Activity.this,Mplayeasy.class);
                startActivity(intent);
            }
        });

        Mmed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(Main2Activity.this,Mplaymed.class);
                startActivity(intent);
            }
        });

        Bback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                intent = new Intent(MainActivity.this,MainScreen.class);
//                startActivity(intent);
            }
        });
    }
}
