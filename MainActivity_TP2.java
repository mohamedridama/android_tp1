package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity_TP2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__t_p2);
        EditText monnaie=(EditText)findViewById(R.id.monnaie);
        RadioButton dollarDh=(RadioButton)findViewById(R.id.Dollar_DH);
        RadioButton euroDh=(RadioButton)findViewById(R.id.Euro_DH);
        Button button=(Button)findViewById(R.id.button);
        TextView resultat=(TextView)findViewById(R.id.resultat);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val;
                int coef;

                    try {

                        String text;
                        text = monnaie.getText().toString();
                        val = Integer.parseInt(text);
                        if(dollarDh.isChecked()) {
                            coef=9;
                        }
                        else {
                            coef=10;
                        }
                        resultat.setText("Resultat:" + val * coef);
                    } catch (NumberFormatException ex) {
                        ex.printStackTrace();
                    }

                }



        });


    }
}