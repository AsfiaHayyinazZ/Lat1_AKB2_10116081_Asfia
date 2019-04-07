package com.example.lat1_akb2_10116081_asfiahz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Biodata extends AppCompatActivity {
    Button btnbiodata;
    TextView ET1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

        btnbiodata=findViewById(R.id.button4);
        ET1 =findViewById(R.id.editText);
        btnbiodata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Biodata.this,sayhai.class);
                intent.putExtra("nama",ET1.getText().toString());
                startActivity(intent);
            }
        });
    }
}
