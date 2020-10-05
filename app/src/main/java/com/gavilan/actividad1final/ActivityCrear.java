package com.gavilan.actividad1final;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;


import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class ActivityCrear extends AppCompatActivity {
    private Spinner spTipo;
    private Button btnRegistrar;
    private EditText txtNombre;
    private RadioButton rbtnFemenino, rbtnMasculino;
    private CheckBox cbDuenio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear);

        spTipo = findViewById(R.id.spTipo);
        btnRegistrar = findViewById(R.id.btnRegistrar);
        txtNombre = findViewById(R.id.txtNom);
        cbDuenio = findViewById(R.id.cbDuenio);
        rbtnFemenino = findViewById(R.id.rbtnF);
        rbtnMasculino = findViewById(R.id.rbtnM);

        ArrayList<String> tipos_de_mascota = new ArrayList<>();
        tipos_de_mascota.add("Perro");
        tipos_de_mascota.add("Gato");
        tipos_de_mascota.add("Tortuga");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(ActivityCrear.this,
                android.R.layout.simple_spinner_dropdown_item , tipos_de_mascota);

        spTipo.setAdapter(adapter);


        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = txtNombre.getText().toString();
                String sexo = null;
                if(rbtnFemenino.isChecked() == true){
                    sexo = "Femenino";
                }else if(rbtnMasculino.isChecked() == true){
                    sexo = "Masculino";
                }else{
                    Snackbar.make(view,"Seleccione sexo",Snackbar.LENGTH_LONG).show();
                    return;
                }
                String tipo = spTipo.getSelectedItem().toString();
                boolean esDuenio;
                if(cbDuenio.isChecked()){
                    esDuenio = true;
                }else{
                    esDuenio = false;
                }
                // Que deberia hacer ahora ocupando la POO
                Mascota mascota = new Mascota(nombre,sexo,tipo,esDuenio);
                MainActivity.ArrayMascotas.add(mascota);
                Snackbar.
                        make(view,"Se registro exitosamente la mascota",Snackbar.LENGTH_LONG).show();

                // Limpiar formulario

                txtNombre.setText("");
                rbtnMasculino.setChecked(false);
                rbtnFemenino.setChecked(false);
                spTipo.setSelection(0);
                cbDuenio.setChecked(false);

            }
        });

    }
}