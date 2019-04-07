package com.example.lat1_akb2_10116081_asfiahz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class sayhai extends AppCompatActivity {
    Button btnsayhai;
    TextView TV1;
    String nm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sayhai);

        btnsayhai=findViewById(R.id.button5);
        TV1 = findViewById(R.id.textView8);
        nm = getIntent().getStringExtra("nama");
        TV1 .setText("Beres! Sekarang " + nm
                + " udah bisa ngecek penggunaan HP mu tiap hari buat bantu kamu ngatur waktu :)");

        btnsayhai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
