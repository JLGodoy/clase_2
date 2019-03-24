package com.example.ejemplobundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { //Todo dentro de éste método se va a ejecutar cuando se abre la ventana
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //Asigna el archivo .xml correspondiente a la UI de ésta java class


        final Button bot1 = findViewById(R.id.Boton1); //Inicia un objeto tipo Button y lo asigna con el Id "Boton1" del archivo .xml

        final EditText nombreUsuario = findViewById(R.id.nombreUsuario); // Inicia un objeto tipo EditText y lo asigna con el Id "nombreUsuario" del archivo .xml

        bot1.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){ //Click Listener para el objeto tipo Button creado arriba (esta parte se auto llena al crear el click listener)

                Intent inten1 = new Intent(v.getContext(),ventana2.class); //Creación de un objeto Intent
                                                                           // en los argumentos se ponen el contexto(ventana de la que va a salir)
                                                                           // y la ventana a la que va a llegar el Intent
                Bundle bundle = new Bundle(); // Objeto tipo bundle;
                                              // en este se guardan los datos que se van a mandar
                                              //a la actividad que recibe al Intent de arriba

                bundle.getSerializable(nombreUsuario.getText().toString()); //Se le asigna la información que va a transportar el bundle

                inten1.putExtra("bundle1", bundle);//Se manda el bundle como extra del Intent
                //se le da un nombre (bundle1)
                //y se asigna el objeto tipo bundle que contiene la información que se desea pasar

                startActivity(inten1); //Lanza la siguiente ventana por medio del Intent creado



            }
        });
    }






}
