package com.example.happy.findmymus;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MusicLIbrary extends AppCompatActivity {

    private Button profileButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_library);

            profileButton = (Button) findViewById(R.id.profile);

            profileButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openProfileActivity();
                }
            });

    }

    public void openProfileActivity(){
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }
}
