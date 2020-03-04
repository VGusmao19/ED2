package com.company;


import Vetor.Lista;

public class Main {

    public static void main(String[] args) {
        System.out.println("Boa noite!");
        Lista vector = new Lista();

        vector.inserir(100);
        vector.inserir(20);
        vector.inserir(30);
        vector.inserir(40);
        vector.inserir(50);
        vector.Listar();
    }//main
}//classe