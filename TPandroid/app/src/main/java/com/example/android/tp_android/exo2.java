package com.example.android.tp_android;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class exo2 extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exo2);

        Button exo3 = (Button) findViewById(R.id.button2);
        Button exo4 = (Button) findViewById(R.id.button3);
        Button exo5 = (Button) findViewById(R.id.button4);
        Button exo6 = (Button) findViewById(R.id.button5);

        exo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent =  new Intent(getApplicationContext(), exo3.class);
                startActivity(myIntent);
                // afficher un toast
                Toast.makeText(getApplicationContext(), "Vers exo3", Toast.LENGTH_SHORT).show();
                // Faire du log info
                Log.i("Button","Vers exo3");
            }
        });
        exo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent =  new Intent(getApplicationContext(), exo4.class);
                startActivity(myIntent);
                // afficher un toast
                Toast.makeText(getApplicationContext(), "Vers exo4", Toast.LENGTH_SHORT).show();
                // Faire du log info
                Log.i("Button","Vers exo4");
            }
        });
        exo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent =  new Intent(getApplicationContext(), exo5.class);
                startActivity(myIntent);
                // afficher un toast
                Toast.makeText(getApplicationContext(), "Vers exo5", Toast.LENGTH_SHORT).show();
                // Faire du log info
                Log.i("Button","Vers exo5");
            }
        });
        exo6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent =  new Intent(getApplicationContext(), exo6.class);
                startActivity(myIntent);
                // afficher un toast
                Toast.makeText(getApplicationContext(), "Vers exo6", Toast.LENGTH_SHORT).show();
                // Faire du log info
                Log.i("Button","Vers exo6");
            }
        });
    }




}
