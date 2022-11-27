package com.example.scoreboard;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ColourChangeActivity_194089T extends AppCompatActivity {
    View view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colour_change_activity194089_t);

        Button change = findViewById(R.id.btn_change);
        TextView red = findViewById(R.id.colour_red);
        TextView blue = findViewById(R.id.colour_blue);
        TextView green = findViewById(R.id.colour_green);
        view = findViewById(R.id.imageView1);

        change.setOnClickListener(v -> {

            int red_value = Integer.parseInt(red.getText().toString());
            int blue_value = Integer.parseInt(blue.getText().toString());
            int green_value = Integer.parseInt(green.getText().toString());

             if(red_value<0 || red_value>255 || blue_value<0 || blue_value>255 || green_value<0 || green_value>255){
                String msg = "value should between 0-255";
                Toast toast1 = Toast.makeText(this, msg,Toast.LENGTH_LONG);
                toast1.show();
            }else {
                view.setBackgroundColor(Color.argb(255, red_value, green_value, blue_value));
            }

        });
    }
}