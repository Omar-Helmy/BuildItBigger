package com.omar.jokesactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        TextView jokeTxt = (TextView) findViewById(R.id.joke_txt);

        Intent intent = getIntent();
        jokeTxt.setText(intent.getStringExtra("JOKE"));
    }
}
