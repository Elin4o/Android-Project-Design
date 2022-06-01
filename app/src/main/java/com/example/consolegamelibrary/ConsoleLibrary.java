package com.example.consolegamelibrary;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.consolegamelibrary.databinding.ActivityConsoleLibraryBinding;

public class ConsoleLibrary extends AppCompatActivity {
    public View goToConsole;
    public View backToPrev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_console_library);

        goToConsole = findViewById(R.id.snes_cardview);
        goToConsole.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                switchActivitiesToConsole();
            }
        });
    }


    private void switchActivitiesToConsole() {
        Intent switchActivityIntent = new Intent(this, GameLibrary.class);
        startActivity(switchActivityIntent);
    }
}