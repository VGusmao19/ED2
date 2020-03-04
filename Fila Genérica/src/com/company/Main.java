package com.company;

import Fila.Fila;

public class Main {

    public static void main(String[] args) {
        Fila<Integer> queue =  new Fila<Integer>();
        queue.add(100);
        System.out.printf(queue.OlhaPrimeiro().toString());
    }
}
