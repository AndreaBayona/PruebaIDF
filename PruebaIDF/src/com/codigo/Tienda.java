package com.codigo;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Tienda {

    //Numero maximo de niños que atendera la tienda
    private int maxKids;
    //Numero de niños en espera cuando la tienda abre
    private int intitialKids;
    // Cantidad de dulces solicitada por cada niño
    private ArrayList<Integer> pedidoKids;


    //Contructor
    public Tienda(int maxKids, int intitialKids, ArrayList<Integer> pedidoKids) {
        this.maxKids = maxKids;
        this.intitialKids = intitialKids;
        this.pedidoKids = pedidoKids;
    }

    //--------------------------------
    // Metodos
    //--------------------------------


    /**
     *
     */
    public int getMaximoIDF() {

        int pedidoMejorNino = -1;
        PriorityQueue<Integer> ninosPeticiones = new PriorityQueue<Integer>();
        for (Integer i : pedidoKids) {
            ninosPeticiones.add(-i);
        }

        int IDF = 0;
        for (int i = 1; i <= maxKids; i++) {

            pedidoMejorNino = ninosPeticiones.poll();
            if (pedidoMejorNino > 1)
                ninosPeticiones.add((int) Math.floor(pedidoMejorNino / 2));
            IDF += Math.pow(pedidoMejorNino, 2);
        }
        return IDF;
    }


    public int getIntitialKids() {
        return intitialKids;
    }

    public void setIntitialKids(int intitialKids) {
        this.intitialKids = intitialKids;
    }

    public ArrayList<Integer> getPedidoKids() {
        return pedidoKids;
    }

    public void setPedidoKids(ArrayList<Integer> pedidoKids) {
        this.pedidoKids = pedidoKids;
    }


    public int getMaxKids() {
        return maxKids;
    }

    public void setMaxKids(int maxKids) {
        maxKids = maxKids;
    }
}
