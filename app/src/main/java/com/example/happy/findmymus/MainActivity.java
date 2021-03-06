package com.example.happy.findmymus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.happy.findmymus.Profile.ProfileMain;

public class MainActivity extends AppCompatActivity {
    private ImageButton mapActivityButton;
    private ImageButton musicLibraryButton;
    private Button profileActivityButton;
    private ImageButton findLocalMusicians;
    private ImageButton directMessageButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mapActivityButton = (ImageButton) findViewById(R.id.FindLocalConcert);
        musicLibraryButton  = (ImageButton) findViewById(R.id.MusicLibrary);
        profileActivityButton = (Button) findViewById(R.id.Profile);
         findLocalMusicians = (ImageButton) findViewById(R.id.findLocalMusicians);
         directMessageButton = (ImageButton) findViewById(R.id.DirectMessages);

        findLocalMusicians.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFindLocalMusiciansActivity();

            }
        });


         directMessageButton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 //openFindLocalMusiciansActivity();
                 openDMActivity();
             }
         });

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
        Intent intent = new Intent(this, FindLocalConActivity.class);
        startActivity(intent);
    }

    public void openProfileActivity() {

        if(ProfileMain.currentProfile.isLoggedIn()) {
            Intent intent = new Intent(this, ProfileActivity.class);
            startActivity(intent);
        }else{
           // Intent intent = new Intent(this, LoginActivity.class);
            Intent intent = new Intent(this, RegisterActivity.class);
            startActivity(intent);
        }
    }

    public void openMusicLibraryActivity() {
        Intent intent = new Intent(this, MusicLIbrary.class);
        startActivity(intent);
    }

    public void openFindLocalMusiciansActivity(){
        Intent intent = new Intent(this, FindMusician.class);
        startActivity(intent);
    }

    public void openFindLocalBandsActivity(){
        Intent intent = new Intent(this, FindLocalBands.class);
        startActivity(intent);
    }

    public void openDMActivity(){
        Intent intent = new Intent(this, DirectMessage.class);
        startActivity(intent);
    }

}
