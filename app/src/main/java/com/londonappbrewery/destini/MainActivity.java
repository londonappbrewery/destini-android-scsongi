package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button mButtonTop;
    Button mButtonBottom;
    TextView mStoryTextView;


    // TODO: Steps 4 & 8 - Declare member variables here:
    int mIndex;


    private Direction[] mQuestionBank = new Direction[] {
            new Direction(R.string.T1_Story, R.string.T1_Ans1, R.string.T1_Ans2, 3, 2),
            new Direction(R.string.T2_Story, R.string.T2_Ans1, R.string.T2_Ans2, 1, 4),
            new Direction(R.string.T3_Story, R.string.T3_Ans1, R.string.T3_Ans2, 6, 5),
            new Direction(R.string.T4_End, R.string.End_Game_Answer, R.string.End_Game_Answer, 0, 0),
            new Direction(R.string.T5_End, R.string.End_Game_Answer, R.string.End_Game_Answer, 0, 0),
            new Direction(R.string.T6_End, R.string.End_Game_Answer, R.string.End_Game_Answer, 0, 0),
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mButtonTop = (Button) findViewById(R.id.buttonTop);
        mButtonBottom = (Button) findViewById(R.id.buttonBottom);
        mStoryTextView = (TextView) findViewById(R.id.storyTextView);



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateQuestion(mQuestionBank[mIndex].getRoute_1());
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateQuestion(mQuestionBank[mIndex].getRoute_2());
            }
        });

    }

    private void updateQuestion(int routeNumber){
        mIndex = routeNumber - 1;

        if (mIndex > 2) {
            endGame();
            Log.d("Pressed", "endGame");
        }else {
            continueGame();
            Log.d("Pressed", "Continue");
        }
    }

    private void endGame(){
        mStoryTextView.setText(mQuestionBank[mIndex].getQuestionID());
        mButtonTop.setVisibility(View.GONE);
        mButtonBottom.setVisibility(View.GONE);
    }

    private void continueGame(){
        mStoryTextView.setText(mQuestionBank[mIndex].getQuestionID());
        mButtonBottom.setText(mQuestionBank[mIndex].getAnswer_2_ID());
        mButtonTop.setText(mQuestionBank[mIndex].getAnswer_1_ID());
    }

}
