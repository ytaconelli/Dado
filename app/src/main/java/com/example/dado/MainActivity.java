package com.example.dado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageViewDado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageViewDado = findViewById(R.id.image_view_dado);
    }

    public  void JogarDado (View v){
        Dado dado = new Dado();
        dado.JogarDado();
        if (dado.getNumero()==1){
            imageViewDado.setImageResource(R.drawable.dado1);
        }
        if (dado.getNumero()==2){
            imageViewDado.setImageResource(R.drawable.dado2);
        }
        if (dado.getNumero()==3){
            imageViewDado.setImageResource(R.drawable.dado3);
        }
        if (dado.getNumero()==4){
            imageViewDado.setImageResource(R.drawable.dado4);
        }
        if (dado.getNumero()==5){
            imageViewDado.setImageResource(R.drawable.dado5);
        }
        if (dado.getNumero()==6){
            imageViewDado.setImageResource(R.drawable.dado6);
        }
    }
}
