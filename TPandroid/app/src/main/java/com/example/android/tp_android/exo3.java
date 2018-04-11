package com.example.android.tp_android;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class exo3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exo3);

        Button btn_valider = (Button) findViewById(R.id.valider);
        Button btn_annuler = (Button) findViewById(R.id.annuler);
        final EditText login = (EditText) findViewById(R.id.login) ;
        final EditText pass = (EditText) findViewById(R.id.pass) ;

        btn_valider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // afficher un toast
                String content = login.getText().toString() + " / " + pass.getText().toString();
                Toast.makeText(getApplicationContext(),content, Toast.LENGTH_SHORT).show();
                // Faire du log info
                Log.i("Exo 3","Valider");
            }
        });
        btn_annuler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login.setText("");
                pass.setText("");
                // afficher un toast
                Toast.makeText(getApplicationContext(), "Reset des champs", Toast.LENGTH_SHORT).show();
                // Faire du log info
                Log.i("Exo 3","Annuler");
            }
        });
    }

}
