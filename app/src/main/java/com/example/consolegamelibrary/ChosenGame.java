package com.example.consolegamelibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ChosenGame extends AppCompatActivity {
    public View backToPrev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chosen_game);

        backToPrev = findViewById(R.id.back_img);
        backToPrev.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                switchActivitiesToPrev();
            }
        });
    }

    private void switchActivitiesToPrev() {
        Intent switchActivityIntent = new Intent(this, GameLibrary.class);
        startActivity(switchActivityIntent);
    }
}