package com.example.happy.findmymus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class DirectMessage extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_direct_message);

        button = (Button) findViewById(R.id.profile);

        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openProfileActivity();
            }
        });
    }

    public void openProfileActivity()
    {
        Intent intent = new Intent (  this, ProfileActivity.class);
        startActivity(intent);
    }
}
