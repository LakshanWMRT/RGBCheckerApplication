package com.example.scoreboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class HistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        //data to populate the RecycleView with
        ArrayList<String> scoreHistory = new ArrayList<>();
        scoreHistory.add("SL vs AUS - 59/9 SL won by 63 runs");
        scoreHistory.add("SL vs PAK - 159/9 SL won by 7 wickets");
        scoreHistory.add("SL vs AUS - Drawn");
        scoreHistory.add("SL vs IND - Cancelled");
        scoreHistory.add("SL vs PAK - Cancelled");

        // set up the RecycleView
        RecyclerView rvScoreHistory = findViewById(R.id.rv_score_history);
        rvScoreHistory.setLayoutManager(new LinearLayoutManager(this));
        HistoryViewAdapter adapter = new HistoryViewAdapter(this, scoreHistory);
        rvScoreHistory.setAdapter(adapter);
    }
}