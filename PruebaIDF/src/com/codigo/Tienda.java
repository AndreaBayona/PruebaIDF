package com.codigo;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Tienda {

    //Numero maximo de niños que atendera la tienda
    private int maxKids;
    //Numero de niños en espera cuando la tienda abre
    private  int intitialKids;
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
    public void mejorNinoParaMaximizar(){

        int pedidoMejorNino = -1;
        PriorityQueue<Integer> ninosPeticiones = new PriorityQueue<Integer>();
        for(Integer i : pedidoKids){
            ninosPeticiones.add(-i);
        }

         pedidoMejorNino = ninosPeticiones.poll();
        int siguienteCantidad = Integer.MAX_VALUE;

        int IDF = pedidoMejorNino^2;

        for(int i = 2; i <= maxKids && siguienteCantidad > 1; i++){

            if(i == 2)
                siguienteCantidad = (int) Math.floor(pedidoMejorNino/2);
            else
                siguienteCantidad = (int) Math.floor(siguienteCantidad/2);

            IDF += siguienteCantidad^2;

           }


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
