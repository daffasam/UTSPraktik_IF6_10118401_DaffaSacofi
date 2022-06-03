package com.example.utspraktik_if6_10118401_daffasacofi;

/*
    Tanggal pengerjaan: Jumat, 3 Juni 2022
    NIM: 10118401
    Nama: Daffa Sacofi Mutawakkil
    Kelas: IF-6
*/

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class CekData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cek_data);

        ImageButton btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent Form = new Intent(getApplicationContext(), Form.class);
                startActivity(Form);
            }
        });

        Button btnSave = findViewById(R.id.btnSave);
        btnBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent Succes = new Intent(getApplicationContext(), Succes.class);
                startActivity(Succes);
            }
        });

    }
}
