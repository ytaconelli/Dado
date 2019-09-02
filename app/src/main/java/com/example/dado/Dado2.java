package com.example.dado;

import java.util.Random;

public class Dado2 {
    private  int numero;
    public  Dado2(){
        this.setNumero(1);
    }
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero){
        if (numero > 0 && numero < 7){
            this.numero = numero;
        }
        else {
            this.numero = 1;
        }
    }
    public void JogarDado(){
        Random gerador1 = new Random();
        this.setNumero(gerador1.nextInt(6)+1);
    }
}
