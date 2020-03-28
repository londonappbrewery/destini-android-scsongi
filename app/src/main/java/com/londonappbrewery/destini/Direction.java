package com.londonappbrewery.destini;

public class Direction {

    private int mQuestionID;
    private int mAnswer_1_ID;
    private int mAnswer_2_ID;
    private int mRoute_1;
    private int mRoute_2;

    public Direction(int questionResourceID, int answer_1_ResourceID, int answer_2_ResourceID, int route_1, int route_2){
        mQuestionID = questionResourceID;
        mAnswer_1_ID = answer_1_ResourceID;
        mAnswer_2_ID = answer_2_ResourceID;
        mRoute_1 = route_1;
        mRoute_2 = route_2;
    }

    public int getQuestionID() {
        return mQuestionID;
    }

    public void setQuestionID(int questionID) {
        mQuestionID = questionID;
    }

    public int getAnswer_1_ID() {
        return mAnswer_1_ID;
    }

    public void setAnswer_1_ID(int answer_1_ID) {
        mAnswer_1_ID = answer_1_ID;
    }

    public int getAnswer_2_ID() {
        return mAnswer_2_ID;
    }

    public void setAnswer_2_ID(int answer_2_ID) {
        mAnswer_2_ID = answer_2_ID;
    }

    public int getRoute_1() {
        return mRoute_1;
    }

    public void setRoute_1(int route_1) {
        mRoute_1 = route_1;
    }

    public int getRoute_2() {
        return mRoute_2;
    }

    public void setRoute_2(int route_2) {
        mRoute_2 = route_2;
    }
}
