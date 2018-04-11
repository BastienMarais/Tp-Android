package com.example.android.tp_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class exo1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exo1);

        // Permet de faire réagir nos buttons
        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // lance une autre activité
                Intent myIntent =  new Intent(getApplicationContext(), exo2.class);
                startActivity(myIntent);
                // afficher un toast
                Toast.makeText(getApplicationContext(), "Vers exo2", Toast.LENGTH_SHORT).show();
                // Faire du log info
                Log.i("Button","Vers exo6");
            }
        });
    }

}
