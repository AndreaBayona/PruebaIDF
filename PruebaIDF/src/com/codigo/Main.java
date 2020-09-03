package com.codigo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int numNinosEnFila = 2;
        int numMaxNinos = 6;
        ArrayList<Integer> pedidoKids =  new ArrayList<Integer>();
        pedidoKids.add(3);
        pedidoKids.add(1);

        Tienda t = new Tienda(numMaxNinos, numNinosEnFila, pedidoKids);

        System.out.println(t.getMaximoIDF());
    }
}
