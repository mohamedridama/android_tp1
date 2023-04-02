package com.example.tp3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt=(Button)findViewById(R.id.bt);
        bt.setOnCreateContextMenuListener(this);
        Button bt2=(Button)findViewById(R.id.button);
        bt2.setOnCreateContextMenuListener(this);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText mn=(EditText)findViewById(R.id.monnaie);
                TextView aff=(TextView)findViewById(R.id.affichage);
                RadioButton rd1=(RadioButton)findViewById(R.id.rd1);
                RadioButton rd2=(RadioButton)findViewById(R.id.rd2);
                float monnaie=Float.valueOf(mn.getText().toString());
                if(rd1.isChecked()){
                    monnaie=monnaie*10;
                }
                else {
                    monnaie=monnaie/10;
                }

                aff.setText(monnaie+"");

            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.principal,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {



        return super.onContextItemSelected(item);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.mn1:
                Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(intent);
               // Toast.makeText(this,"bonjour  menu1 ...",Toast.LENGTH_SHORT).show();
        }
        switch (item.getItemId()){
            case R.id.prp:
                Toast.makeText(this,"à propos ...",Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.contextuel, menu);

    }
}