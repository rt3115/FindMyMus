package com.example.happy.findmymus;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;
import java.util.Random;

public class FindMusician extends AppCompatActivity {

    private Button profileActivityButton;
    private ImageButton likeMusButton;
    private ImageButton noMusButton;
    private ImageView profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_musician);

        profileActivityButton = (Button) findViewById(R.id.Profile);
        likeMusButton = (ImageButton) findViewById(R.id.Like);
        noMusButton = (ImageButton) findViewById(R.id.No);
        profile = (ImageView) findViewById(R.id.profile_pic);

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
        Toast.makeText(getApplicationContext(), "Liked Artist", Toast.LENGTH_LONG).show();
        getNewArtist();
    }

    public void noArtist(){
        Toast.makeText(getApplicationContext(), "Disliked Artist", Toast.LENGTH_LONG).show();
        getNewArtist();

    }

    public void getNewArtist(){

        Random rand = new Random();
        int n = rand.nextInt(12)+1;


        switch (n) {
            case 1: profile.setImageResource(R.drawable.musician_numba_1);
                break;
            case 2: profile.setImageResource(R.drawable.musician_numba_2);
                break;
            case 3: profile.setImageResource(R.drawable.musician_numba_3);
                break;
            case 4: profile.setImageResource(R.drawable.musician_numba_4);
                break;
            case 5: profile.setImageResource(R.drawable.musician_numba_5);
                break;
            case 6: profile.setImageResource(R.drawable.musician_numba_6);
                break;
            case 7: profile.setImageResource(R.drawable.musician_numba_7);
                break;
            case 8: profile.setImageResource(R.drawable.musician_numba_8);
                break;
            case 9: profile.setImageResource(R.drawable.musician_numba_9);
                break;
            case 10: profile.setImageResource(R.drawable.musician_numba_10);
                break;
            case 11: profile.setImageResource(R.drawable.musician_numba_11);
                break;
        }



    }

}
