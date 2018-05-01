package com.example.tomek.stanowiskopracy.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    /**
     * Adds points for Team A
     */
    public void addThreePointsForTeamA(View v){
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }
    public void addTwoPointsForTeamA(View v){
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }
    public void addFreeThrowForTeamA(View v){
        ++scoreTeamA;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Adds points for Team B
     */
    public void addThreePointsForTeamB(View v){
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }
    public void addTwoPointsForTeamB(View v){
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }
    public void addFreeThrowForTeamB(View v){
        ++scoreTeamB;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     *  Reset all points for both teams.
     */
    public void resetAllPoints(View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

}
