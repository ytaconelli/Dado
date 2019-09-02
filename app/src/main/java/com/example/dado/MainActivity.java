package com.example.dado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageViewDado;
    private ImageView imageViewDado2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageViewDado = findViewById(R.id.image_view_dado);
        imageViewDado2 = findViewById(R.id.image_view_dado2);
    }

    public  void JogarDado (View v){
        Dado dado = new Dado();
        Dado2 dado2 = new Dado2();
        dado.JogarDado();
        dado2.JogarDado();

        if (dado.getNumero()==1){
            imageViewDado.setImageResource(R.drawable.dado1);
        }
        else if (dado.getNumero()==2){
            imageViewDado.setImageResource(R.drawable.dado2);
        }
        else if (dado.getNumero()==3){
            imageViewDado.setImageResource(R.drawable.dado3);
        }
        else if (dado.getNumero()==4){
            imageViewDado.setImageResource(R.drawable.dado4);
        }
        else if (dado.getNumero()==5){
            imageViewDado.setImageResource(R.drawable.dado5);
        }
        else if (dado.getNumero()==6){
            imageViewDado.setImageResource(R.drawable.dado6);
        }

        if (dado2.getNumero()==1){
            imageViewDado2.setImageResource(R.drawable.dado1);
        }
        else if (dado2.getNumero()==2){
            imageViewDado2.setImageResource(R.drawable.dado2);
        }
        else if (dado2.getNumero()==3){
            imageViewDado2.setImageResource(R.drawable.dado3);
        }
        else if (dado2.getNumero()==4){
            imageViewDado2.setImageResource(R.drawable.dado4);
        }
        else if (dado2.getNumero()==5){
            imageViewDado2.setImageResource(R.drawable.dado5);
        }
        else if (dado2.getNumero()==6){
            imageViewDado2.setImageResource(R.drawable.dado6);
        }
    }
}
