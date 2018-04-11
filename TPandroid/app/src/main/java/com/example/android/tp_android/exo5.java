package com.example.android.tp_android;

import android.net.wifi.p2p.WifiP2pManager;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class exo5 extends AppCompatActivity implements View.OnClickListener {

    // Eléments graphiques
    TextView text_time ;
    Button btn_on ;
    Button btn_off ;
    Button btn_reset ;

    // Variables pour le chrono
    Boolean running = false;
    int seconds = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exo5);

        // Récupération des id
        text_time = (TextView) findViewById(R.id.time);
        btn_on = (Button) findViewById(R.id.on);
        btn_off = (Button) findViewById(R.id.off);
        btn_reset = (Button) findViewById(R.id.reset);

        // Maj des OnClickListener
        btn_on.setOnClickListener(this);
        btn_off.setOnClickListener(this);
        btn_reset.setOnClickListener(this);

        // Lance le timer
        runTimer();
    }

    // Fonction timer
    private void runTimer(){
        final Handler handler = new Handler();
        handler.post(new Runnable(){
            public void run(){
                int hours = seconds/3600;
                int minutes = (seconds%3600)/60;
                int secs = seconds % 60;

                String time = String.format("%02d : %02d : %02d",hours,minutes,secs);
                text_time.setText(time);
                if(running){
                    seconds++;
                }
                handler.postDelayed(this,1000);
            }
        });
    }

    // Permet de savoir qui est cliqué et redirige vers la bonne action a faire
    public void onClick(View v) {
        if (v.getId() == R.id.on){
            action_on();
        }
        else if (v.getId() == R.id.off){
            action_off();
        }
        else if(v.getId() == R.id.reset){
            action_reset();
        }
    }

    private void action_off() {
        running = false;
    }

    private void action_reset() {
        running = false;
        seconds = 0;
    }

    private void action_on() {
        running = true;
    }


}
