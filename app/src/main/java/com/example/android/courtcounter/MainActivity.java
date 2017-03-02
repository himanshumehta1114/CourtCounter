package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA=0;
    int scoreTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void threepointA(View view){
        scoreTeamA=scoreTeamA+3;
        displayForTeamA(scoreTeamA);
    }

    public void twopointA(View view){
        scoreTeamA=scoreTeamA+2;
        displayForTeamA(scoreTeamA);
    }

    public void freethrowA(View view){
        scoreTeamA=scoreTeamA+1;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
//  FOR TEAM B

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void threepointB(View view){
        scoreTeamB=scoreTeamB+3;
        displayForTeamB(scoreTeamB);
    }

    public void twopointB(View view){
        scoreTeamB=scoreTeamB+2;
        displayForTeamB(scoreTeamB);
    }

    public void freethrowB(View view){
        scoreTeamB=scoreTeamB+1;
        displayForTeamB(scoreTeamB);
    }

    public void reset(View view){
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA(0);
        displayForTeamB(0);
    }
}
