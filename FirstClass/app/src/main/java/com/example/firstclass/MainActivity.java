package com.example.firstclass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edt1,edt2;
    Button btnCalcular,btnIrResta;
    TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt1 = findViewById(R.id.edt1);
        edt2 = findViewById(R.id.edt2);
        btnCalcular = findViewById(R.id.btnCalcular);
        btnIrResta = findViewById(R.id.btnIrResta);
        txt1 = findViewById(R.id.txt1);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cajita = edt1.getText().toString();
                String cajita2 =edt2.getText().toString();

                if (!cajita.equals("") && !cajita2.equals("")){
                    int suma= Integer.parseInt(cajita) + Integer.parseInt(cajita2);

                    txt1.setText(suma+"");
                }else{
                    Toast.makeText(MainActivity.this,"Digite los campos vacios",Toast.LENGTH_LONG).show();
                    txt1.setText("0");
                    edt1.setText("");
                    edt2.setText("");
                }

            }
        });

        btnIrResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Activity2.class);
                startActivity(intent);
                finish();//para destruir la pantalla y al dar hacia atras se sale de la app
            }
        });
    }
}