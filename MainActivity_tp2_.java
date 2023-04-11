package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity_tp2_ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tp2_);
        CheckBox ing=(CheckBox)findViewById(R.id.ing);
        CheckBox art=(CheckBox)findViewById(R.id.art);
        TextView aff=(TextView)findViewById(R.id.affichage);

        ing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(art.isChecked() && ing.isChecked()) {
                    aff.setText("vous êtes artiste et Ingénieur.");
                }
                else{
                    if(ing.isChecked()) {
                        aff.setText("vous êtes Ingénieur.");
                    }
                    if (art.isChecked()){
                        aff.setText("vous êtes artiste.");
                    }
                    if(!art.isChecked() && !ing.isChecked()){
                        aff.setText("vous n'êtes ni artiste ni ingénieur");
                    }
                }
            }
        });
        art.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(art.isChecked() && ing.isChecked()) {
                    aff.setText("vous êtes artiste et Ingénieur.");
                }
                else{
                    if(ing.isChecked()) {
                        aff.setText("vous êtes Ingénieur.");
                    }
                    if (art.isChecked()){
                        aff.setText("vous êtes artiste.");
                    }
                    if(!art.isChecked() && !ing.isChecked()){
                        aff.setText("vous n'êtes ni artiste ni ingénieur");
                    }
                }
            }
        });
    }
}