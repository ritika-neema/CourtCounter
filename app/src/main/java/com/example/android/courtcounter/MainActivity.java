package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    TextView tvscoreViewA;
    TextView tvscoreViewB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvscoreViewA  = (TextView) findViewById(R.id.team_a_score);
        tvscoreViewB = (TextView) findViewById(R.id.team_b_score);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        // TODO Auto-generated method stub
        super.onSaveInstanceState(outState);
        outState.putString("SCORETEAMA", (String)tvscoreViewA.getText());
        outState.putString("SCORETEAMB", (String)tvscoreViewB.getText());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onRestoreInstanceState(savedInstanceState);
        tvscoreViewA.setText(savedInstanceState.getString("SCORETEAMA"));
        tvscoreViewB.setText(savedInstanceState.getString("SCORETEAMB"));
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
       // scoreViewA = (TextView) findViewById(R.id.team_a_score);
        tvscoreViewA.setText(String.valueOf(score));
    }

    public void add3_a(View view) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    public void add2_a(View view) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    public void freethrow_a(View view) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    public void add6_a(View view) {
        scoreTeamA += 6;
        displayForTeamA(scoreTeamA);
    }

    public void displayForTeamB(int score) {
       // scoreViewB = (TextView) findViewById(R.id.team_b_score);
        tvscoreViewB.setText(String.valueOf(score));
    }

    public void add6_b(View view) {
        scoreTeamB += 6;
        displayForTeamB(scoreTeamB);
    }

    public void add3_b(View view) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    public void add2_b(View view) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    public void freethrow_b(View view) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
