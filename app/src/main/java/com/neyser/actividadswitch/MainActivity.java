package com.neyser.actividadswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Switch s1, s2;
    private Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcular(View view){
        s1 = findViewById(R.id.s1);
        s2 = findViewById(R.id.s2);
        b1 = findViewById(R.id.b1);

        String mensaje = "Se activaron las siguientes opciones:";

        if (s1.isChecked()){
            mensaje+="\n- Datos moviles";
        }
        if (s2.isChecked()){
            mensaje+="\n- Wifi";
        }

        if (!s1.isChecked() && !s2.isChecked()){
            mensaje = "No se activo ninguna opción";
        }

        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show();



    }
}