package com.example.geografiamundial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnHumana,btnRegional,btnFisica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btnFisica = findViewById(R.id.btnFisica);
        btnHumana = findViewById(R.id.btnHumana);
        btnRegional = findViewById(R.id.btnRegional);

        btnFisica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,FisicaActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btnHumana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,HumanaActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btnRegional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,RegionalActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }
}