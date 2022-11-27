package com.example.scoreboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button count = findViewById(R.id.btn_count);
        Button toast = findViewById(R.id.btn_toast);
        Button reset = findViewById(R.id.btn_reset);
        TextView score = findViewById(R.id.tv_score);

        toast.setOnClickListener(v -> {
                String msg = "The score is "+ score.getText()+"!";
                Toast toast1 = Toast.makeText(this, msg,Toast.LENGTH_LONG);
                toast1.show();
        });

        reset.setOnClickListener(v -> {
            score.setText(String.valueOf(0));
        });

        count.setOnClickListener(v -> {
            int score_count = Integer.parseInt(score.getText().toString());
            score_count += 1;
            score.setText(Integer.toString(score_count) );
//            score.setText(String.valueOf(score_count));
        });
    }
}