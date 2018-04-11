package com.example.android.tp_android;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class exo4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exo4);
        final Button btn_invisible = (Button) findViewById(R.id.invisible);
        final Button btn_visible = (Button) findViewById(R.id.visible);
        final TextView blabla = (TextView) findViewById(R.id.blabla) ;


        btn_visible.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Change la visibilité du bouton
                btn_visible.setVisibility(View.INVISIBLE);
                btn_invisible.setVisibility(View.VISIBLE);
                // Changer le contenu du textview
                String content = "Bindour le monde !" ;
                blabla.setText(content);
                // Faire du log info
                Log.i("Exo 4","btn_visible");
            }
        });

        btn_invisible.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Change la visibilité du bouton
                btn_visible.setVisibility(View.VISIBLE);
                btn_invisible.setVisibility(View.INVISIBLE);
                // Changer le contenu du textview
                String content = "" + blabla.getTextSize();
                blabla.setText(content);
                // Faire du log info
                Log.i("Exo 4","btn_invisible");
            }
        });
    }

}
