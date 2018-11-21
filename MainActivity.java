package com.example.faisal.color_change;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void togreen(View v)
    {

        RelativeLayout r=(RelativeLayout)findViewById(R.id.bg);
               r.setBackgroundColor(Color.GREEN);
            }
    public void toblue(View v)
    {

        RelativeLayout r=(RelativeLayout)findViewById(R.id.bg);
        r.setBackgroundColor(Color.BLUE);
    }
    public void tored(View v)
    {

        RelativeLayout r=(RelativeLayout)findViewById(R.id.bg);
        r.setBackgroundColor(Color.RED);
    }

    }

