package com.example.happy.findmymus;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class FindMusician extends AppCompatActivity {

    private Button profileActivityButton;
    private ImageButton likeMusButton;
    private ImageButton noMusButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_musician);

        profileActivityButton = (Button) findViewById(R.id.Profile);
        likeMusButton = (ImageButton) findViewById(R.id.Like);
        noMusButton = (ImageButton) findViewById(R.id.No);

        profileActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProfileActivity();
            }
        });
        likeMusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                likeArtist();
            }
        });
        noMusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                noArtist();
            }
        });

    }

    public void openProfileActivity(){
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }

    public void likeArtist(){
        Toast.makeText(getApplicationContext(), "This is my Toast message!", Toast.LENGTH_LONG).show();
    }

    public void noArtist(){
        Toast.makeText(getApplicationContext(), "This is my Toast message!", Toast.LENGTH_LONG).show();
    }
}
