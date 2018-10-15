package com.example.happy.findmymus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton mapActivityButton;
    private ImageButton musicLibraryButton;
    private Button profileActivityButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mapActivityButton = (ImageButton) findViewById(R.id.FindLocalConcert);
        musicLibraryButton  = (ImageButton) findViewById(R.id.MusicLibrary);
        profileActivityButton = (Button) findViewById(R.id.Profile);

        profileActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProfileActivity();
            }
        });

        mapActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMapActivity();
            }
        });

        musicLibraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMusicLibraryActivity();
            }
        });
    }

    public void openMapActivity() {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }

    public void openProfileActivity() {
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }

    public void openMusicLibraryActivity() {
        Intent intent = new Intent(this, MusicLIbrary.class);
        startActivity(intent);
    }

}
