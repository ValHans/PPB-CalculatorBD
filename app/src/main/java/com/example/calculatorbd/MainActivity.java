package com.example.calculatorbd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Lingkaran = (Button) findViewById(R.id.lingkaran);

        Lingkaran.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent lingkaran = new Intent(MainActivity.this, lingkaran.class);
                startActivity(lingkaran);
            }
        });
        Button segitiga = (Button) findViewById(R.id.segitiga);

        segitiga.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent segitiga = new Intent(MainActivity.this, segitiga.class);
                startActivity(segitiga);
            }
        });
        Button persegi = (Button) findViewById(R.id.persegi);

        persegi.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent persegi = new Intent(MainActivity.this, persegi.class);
                startActivity(persegi);
            }
        });
    }
    public void segitiga(View view){
        Intent segitiga = new Intent(MainActivity.this, com.example.calculatorbd.segitiga.class);
        startActivity(segitiga);
    }
    public void lingkaran(View view){
        Intent lingkaran = new Intent(MainActivity.this, com.example.calculatorbd.lingkaran.class);
        startActivity(lingkaran);
    }
    public void persegi(View view){
        Intent persegi = new Intent(MainActivity.this, com.example.calculatorbd.persegi.class);
        startActivity(persegi);
    }
}