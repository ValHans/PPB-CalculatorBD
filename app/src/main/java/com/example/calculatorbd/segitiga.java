package com.example.calculatorbd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class segitiga extends AppCompatActivity {

    private EditText alas;
    private EditText tinggi;
    private EditText hasil;
    private Button Luas;
    private Button Keliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);
        alas = (EditText) findViewById(R.id.atxt);
        tinggi = (EditText) findViewById(R.id.ttxt);
        hasil = (EditText) findViewById(R.id.hasil);
        Luas = (Button) findViewById(R.id.luas);
        Keliling = (Button) findViewById(R.id.keliling);
    }
    public void luas3(View view) {
        try {
            int a = Integer.parseInt(alas.getText().toString());
            int t = Integer.parseInt(tinggi.getText().toString());
            int luas = (a * t) / 2;
            hasil.setText(String.valueOf(luas));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void keliling3(View view) {
        try {
            int a = Integer.parseInt(alas.getText().toString());
            int keliling = a+a+a;
            hasil.setText(String.valueOf(keliling));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void kembali3(View view){
        finish();
    }
}