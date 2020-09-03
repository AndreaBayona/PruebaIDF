package com.codigo;

import java.util.ArrayList;

public class Tienda {

    //Numero maximo de niños que atendera la tienda
    private int maxKids;
    //Numero de niños en espera cuando la tienda abre
    private  int intitialKids;
    // Cantidad de dulces solicitada por cada niño
    static ArrayList<Integer> pedidoKids;

    public Tienda(int maxKids, int intitialKids) {
        this.maxKids = maxKids;
        this.intitialKids = intitialKids;
        pedidoKids = new ArrayList<Integer>();
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
