package com.example.ejemplobundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ventana2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana2);

        Intent intent1 = getIntent(); //Se crea un objeto Bundle que va a recibir la información de la actividad origen
        String name = intent1.getStringExtra("bundle1"); //Variable que va a guardar la información extraida del bundle
        //aquí se nota la importancia de nombrar al Bundle que transporta la información

        Toast.makeText(this, "Bienvenido" + name, Toast.LENGTH_LONG).show(); //mensaje tipo Toast
        //Los argumentos del Toast son :
        // Contexto (ventana) en el que se va a mostrar
        //La cadena de texto que va a mostrar
        //El tiempo que va a mostrarse (solo puede ser SHORT o LONG
        //.show activa el Toast

        final Button button2 = findViewById(R.id.boton2); //Inicia Objeto tipo Button
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {                //Asigna un Click Listener para el objeto Button

                finish(); //cierra la actividad actual
            }
        });

    }
}
