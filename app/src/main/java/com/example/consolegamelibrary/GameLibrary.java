package com.example.consolegamelibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GameLibrary extends AppCompatActivity {
    public View goToGame;
    public View backToPrev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_library);

        goToGame = findViewById(R.id.super_mario_game);
        goToGame.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                switchActivitiesToGame();
            }
        });

        backToPrev = findViewById(R.id.back_img_to_console);
        backToPrev.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                switchActivitiesToPrev();
            }
        });
    }

    private void switchActivitiesToPrev() {
        Intent switchActivityIntent = new Intent(this, ConsoleLibrary.class);
        startActivity(switchActivityIntent);
    }

    private void switchActivitiesToGame() {
        Intent switchActivityIntent = new Intent(this, ChosenGame.class);
        startActivity(switchActivityIntent);
    }
}