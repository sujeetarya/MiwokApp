package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //  Create ArrayList of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("lutti", "one",R.drawable.number_one));
        words.add(new Word("otiiko", "two",R.drawable.number_two));
        words.add(new Word("tolookosu", "three",R.drawable.number_three));
        words.add(new Word("oyyisa", "four",R.drawable.number_four));
        words.add(new Word("massokka", "five",R.drawable.number_five));
        words.add(new Word("temmokka", "six",R.drawable.number_six));
        words.add(new Word("kenekaku", "seven",R.drawable.number_seven));
        words.add(new Word("kawinta", "eight",R.drawable.number_eight));
        words.add(new Word("wo’e", "nine",R.drawable.number_nine));
        words.add(new Word("na’aacha", "ten",R.drawable.number_ten));

        // Create an {@link WordAdapter}, whose data source is a list of
        // {@link Word}s. The adapter knows how to create list item views for each item
        // in the list.
        WordAdapter itemsAdapter = new WordAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(itemsAdapter);
    }
}