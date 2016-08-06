package com.example.nguyennghia.databasedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get Instance.
        DatabaseHelper db = DatabaseHelper.getInstance(this);

        //insert data
        db.insertWord(new Word("book", "Sách(n), đặt chổ(v)"));
        db.insertWord(new Word("table", "Bàn(n)"));
        db.insertWord(new Word("action movie", "Phim hành động"));

        //loge all word in database
        for(Word w: db.getAllWord()){
            Log.e(TAG, "onCreate: " + w.getId() + ", " + w.getWord() + ", " + w.getMean());
        }

        //upate word
        Word word = db.getAllWord().get(0);
        word.setMean("Sách(n), đặt chổ(v), đặt vé(v)");
        db.updateWord(word);


        //loge all word in database
        for(Word w: db.getAllWord()){
            Log.e(TAG, "onCreate: " + w.getId() + ", " + w.getWord() + ", " + w.getMean());
        }

        //delete word
        db.deleteWord(db.getAllWord().get(0));

        //loge total rows in database
        Log.e(TAG, "onCreate: " + db.getTotalWord());

    }
}
