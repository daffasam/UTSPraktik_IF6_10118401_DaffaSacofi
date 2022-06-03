package com.example.utspraktik_if6_10118401_daffasacofi;

/*
    Tanggal pengerjaan: Jumat, 3 Juni 2022
    NIM: 10118401
    Nama: Daffa Sacofi Mutawakkil
    Kelas: IF-6
*/

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Form extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form);

        Button btnNext = findViewById(R.id.btnNext);
        btnNext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent CekData = new Intent(getApplicationContext(), CekData.class);
                startActivity(CekData);
            }
        });

    }
}