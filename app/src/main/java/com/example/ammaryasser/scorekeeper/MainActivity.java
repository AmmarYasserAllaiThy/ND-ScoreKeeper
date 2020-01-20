package com.example.ammaryasser.scorekeeper;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView team1ScoreTV;
    private TextView team1FoulsTV;
    private TextView team2ScoreTV;
    private TextView team2FoulsTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        team1ScoreTV = findViewById(R.id.team1ScoreTV);
        team1FoulsTV = findViewById(R.id.team1FoulsTV);
        team2ScoreTV = findViewById(R.id.team2ScoreTV);
        team2FoulsTV = findViewById(R.id.team2FoulsTV);

        reset(null);
    }


    public void team1_score_plus(View view) {
        increment(team1ScoreTV);
    }

    public void team1_score_minus(View view) {
        decrement(team1ScoreTV);
    }

    public void team1_fouls_plus(View view) {
        increment(team1FoulsTV);
    }

    public void team1_fouls_minus(View view) {
        decrement(team1FoulsTV);
    }


    public void team2_score_plus(View view) {
        increment(team2ScoreTV);
    }

    public void team2_score_minus(View view) {
        decrement(team2ScoreTV);
    }

    public void team2_fouls_plus(View view) {
        increment(team2FoulsTV);
    }

    public void team2_fouls_minus(View view) {
        decrement(team2FoulsTV);
    }


    public void reset(View view) {
        team1ScoreTV.setText("0");
        team1FoulsTV.setText("0");
        team2ScoreTV.setText("0");
        team2FoulsTV.setText("0");
    }


    private void increment(TextView tv) {
        tv.setText(String.valueOf(getIntVal(tv) + 1));
    }

    private void decrement(TextView tv) {
        int val = getIntVal(tv);
        tv.setText(String.valueOf(val > 0 ? val - 1 : val));
    }

    private int getIntVal(TextView tv) {
        return Integer.parseInt(tv.getText().toString());
    }

}