package com.example.android.chesscounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreWhite = 0;
    int scoreBlack = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for White by 1 point.
     */
    public void addOneForWhite(View v) {
        scoreWhite = scoreWhite + 1;
        displayForWhite(scoreWhite);
    }

    /**
     * Increase the score for White by 3 points.
     */
    public void addThreeForWhite(View v) {
        scoreWhite = scoreWhite + 3;
        displayForWhite(scoreWhite);
    }

    /**
     * Increase the score for White by 5 points.
     */
    public void addFiveForWhite(View v) {
        scoreWhite = scoreWhite + 5;
        displayForWhite(scoreWhite);
    }

    /**
     * Increase the score for White by 9 points.
     */
    public void addNineForWhite(View v) {
        scoreWhite = scoreWhite + 9;
        displayForWhite(scoreWhite);
    }

    /**
     * Increase the score for White by 1 point.
     */
    public void addOneForBlack(View v) {
        scoreBlack = scoreBlack + 1;
        displayForBlack(scoreBlack);
    }

    /**
     * Increase the score for White by 3 points.
     */
    public void addThreeForBlack(View v) {
        scoreBlack = scoreBlack + 3;
        displayForBlack(scoreBlack);
    }

    /**
     * Increase the score for White by 5 points.
     */
    public void addFiveForBlack(View v) {
        scoreBlack = scoreBlack + 5;
        displayForBlack(scoreBlack);
    }

    /**
     * Increase the score for White by 9 points.
     */
    public void addNineForBlack(View v) {
        scoreBlack = scoreBlack + 9;
        displayForBlack(scoreBlack);
    }

    // Reset button for the scores of both teams
    public void resetScores(View v) {
        scoreWhite = 0;
        scoreBlack = 0;
        displayForWhite(scoreWhite);
        displayForBlack(scoreBlack);
    }

    /**
     * Displays the given score for white player
     */
    public void displayForWhite(int score) {
        TextView scoreView = (TextView) findViewById(R.id.white_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for black player
     */
    public void displayForBlack(int score) {
        TextView scoreView = (TextView) findViewById(R.id.black_score);
        scoreView.setText(String.valueOf(score));
    }

}
