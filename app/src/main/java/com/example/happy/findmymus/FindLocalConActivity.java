package com.example.happy.findmymus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FindLocalConActivity extends AppCompatActivity {

    Button searchbarButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_local_con);

        searchbarButton = (Button) findViewById(R.id.search_bar);

        searchbarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMapsSearch();
            }
        });
    }

    public void openMapsSearch(){
        Intent intent = new Intent(this, SearchMapActivity.class);
        startActivity(intent);
    }
}
