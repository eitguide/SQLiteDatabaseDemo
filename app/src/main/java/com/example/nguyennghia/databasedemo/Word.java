package com.example.nguyennghia.databasedemo;

/**
 * Created by nguyennghia on 8/6/16.
 */
public class Word {
    private int mId;
    private String mWord;
    private String mMean;

    public Word() {

    }

    public Word(int id, String word, String mean) {
        this.mId = id;
        this.mWord = word;
        this.mMean = mean;
    }

    public Word(String word, String mean) {
        this.mWord = word;
        this.mMean = mean;
    }

    public void setMean(String mean) {
        this.mMean = mean;
    }

    public void setWord(String word) {
        this.mWord = word;
    }

    public int getId() {
        return mId;
    }

    public String getWord() {
        return mWord;
    }

    public String getMean() {
        return mMean;
    }
}
