package com.example.lat1_akb2_10116081_asfiahz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

   /*
   Asfia Hayyinaz Zahro
   10116081
   IF-2
   Change Log Sabtu 6 April
   1. Membuat MainActivity  jam 14.00
   2. Membuat login         jam 14.50
   3. Membuat login         jam 16.15
   4.Membuat sayhai         jam 17.20
    */


public class MainActivity extends AppCompatActivity {
        Button btnstart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnstart=findViewById(R.id.button3);
        btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Login.class);
                startActivity(intent);
            }
        });
    }
}
