package com.example.consolegamelibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainMenuActivity extends AppCompatActivity {
    public View goToConsole;
    public View goToGame;
    public View goToMultipleConsoles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        goToConsole = findViewById(R.id.snes_cardview_main_menu);
        goToConsole.setOnClickListener(view -> switchActivitiesToChosenConsole());

        goToGame = findViewById(R.id.super_mario_game_main_menu);
        goToGame.setOnClickListener(view -> switchActivitiesToGame());

        goToMultipleConsoles = findViewById(R.id.to_console);
        goToMultipleConsoles.setOnClickListener(view -> switchActivitiesToConsoles());
    }

    private void switchActivitiesToChosenConsole() {
        Intent switchActivityIntent = new Intent(this, GameLibrary.class);
        startActivity(switchActivityIntent);
        finish();
    }
    private void switchActivitiesToGame() {
        Intent switchActivityIntent = new Intent(this, ChosenGame.class);
        startActivity(switchActivityIntent);
        finish();
    }
    private void switchActivitiesToConsoles() {
        Intent switchActivityIntent = new Intent(this, ConsoleLibrary.class);
        startActivity(switchActivityIntent);
        finish();
    }
}