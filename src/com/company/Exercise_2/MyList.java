package com.company.Exercise_2;

import java.util.ArrayList;

public class MyList<T>{
    /**
     * Am facut un array de tip ArrayList pentru ca nu pot initializa un array cu un tip T direct.
     *  public MyList(int dimension) {
     *         this.array = new T[dimension]; -> Eroare la initializare directa;
     *     }
     */
    private ArrayList<T> array = new ArrayList<>();

    /**
     * Nu am mai facut un constructor pentru a testa separat metoda de add.
     */

    public void add(T element) {
        this.array.add(element);
    }

    public void print() {
        for (T element : this.array) {
            System.out.println(element);
        }
    }

    public boolean lookup(T element) {
        for (T iterator : this.array) {
            if(iterator.equals(element)){
                return true;
            }
        }
        return false;
    }
}
