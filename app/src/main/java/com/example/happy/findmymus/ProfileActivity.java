package com.example.happy.findmymus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.happy.findmymus.Profile.ProfileData;

public class ProfileActivity extends AppCompatActivity {

    ProfileData profileData = new ProfileData("Listener", "Fairport New York");

    private Button settingsActivityButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        printStarter();

        settingsActivityButton = (Button) findViewById(R.id.Settings);

        settingsActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSettingsActivity();
            }
        });
    }

    public void openSettingsActivity(){
        Intent intent = new Intent(this, SettingsWindowActivity.class);
        startActivity(intent);
    }

    public void printStarter() {
        ((TextView)findViewById(R.id.des)).setText(profileData.getDescription());
    }
}
