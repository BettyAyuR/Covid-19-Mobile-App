package com.example.a17416255201107_covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class RapidActivity extends AppCompatActivity {
    TextView score, hasil;
    RadioButton Y1, Y2, Y3, Y4, Y5, Y6, Y7, Y8, Y9, Y10, Y11, Y12;
    int n1, n2, score_temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rapid_activity);

        score = findViewById(R.id.txtScore);
        hasil = findViewById(R.id.txtHasil);
        Y1 = findViewById(R.id.Y1);
        Y2 = findViewById(R.id.Y2);
        Y3 = findViewById(R.id.Y3);
        Y4 = findViewById(R.id.Y4);
        Y5 = findViewById(R.id.Y5);
        Y6 = findViewById(R.id.Y6);
        Y7 = findViewById(R.id.Y7);
        Y8 = findViewById(R.id.Y8);
        Y9 = findViewById(R.id.Y9);
        Y10 = findViewById(R.id.Y10);
        Y11 = findViewById(R.id.Y11);
        Y12 = findViewById(R.id.Y12);
    }

    public void Hasil(View view) {
        if (Y1.isChecked()){
            n1 = 1;
        }else{
            n1 = 0;
        }

        if (Y2.isChecked()){
            n2 = 1;
        }else{
            n2 = 0;
        }

        if (Y3.isChecked()){
            n1 = 1;
        }else{
            n1 = 0;
        }

        if (Y4.isChecked()){
            n2 = 1;
        }else{
            n2 = 0;
        }

        if (Y5.isChecked()){
            n1 = 1;
        }else{
            n1 = 0;
        }

        if (Y6.isChecked()){
            n2 = 1;
        }else{
            n2 = 0;
        }

        if (Y7.isChecked()){
            n1 = 1;
        }else{
            n1 = 0;
        }

        if (Y8.isChecked()){
            n2 = 1;
        }else{
            n2 = 0;
        }

        if (Y9.isChecked()){
            n1 = 1;
        }else{
            n1 = 0;
        }

        if (Y10.isChecked()){
            n2 = 1;
        }else{
            n2 = 0;
        }

        if (Y11.isChecked()){
            n1 = 1;
        }else{
            n1 = 0;
        }

        if (Y12.isChecked()){
            n2 = 1;
        }else{
            n2 = 0;
        }

        score_temp = n1+n2;
        score.setText(Integer.toString(score_temp));

        if (score_temp <=1){
            hasil.setText("Resiko Terinfeksi Rendah");
        }else{
            hasil.setText("Resiko Terinfeksi Tinggi");
        }

    }
}
