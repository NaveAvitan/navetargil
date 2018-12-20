package com.example.user.nave2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;
public class MainActivity extends AppCompatActivity {
ImageButton ib;
ImageView iv;
int num;
Random rnd=new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv= (ImageView)  findViewById(R.id.iv);
        ib= (ImageButton) findViewById(R.id.ib);
    }

    public void cli(View view) {
       num=rnd.nextInt(3)+1;
       switch (num){
           case 1: ib.setImageResource(R.drawable.num1);
                   iv.setImageResource(R.drawable.op1);
           case 2: ib.setImageResource(R.drawable.num2);
                   iv.setImageResource(R.drawable.op2);
           case 3: ib.setImageResource(R.drawable.num3);
                   iv.setImageResource(R.drawable.op3);
       }
    }
}
