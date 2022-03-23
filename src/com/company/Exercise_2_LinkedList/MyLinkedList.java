package com.company.Exercise_2_LinkedList;

public class MyLinkedList<T> {
    private Node head;

    /**
     * Nu am facut un constructor cu parametru dimensiune pentru ca lista se aloca dinamic prin metoda de add.
     */

    public Node getHead() {
        return head;
    }

    public void add(T element) {
        if (head == null) {
            this.head = new Node(element);
        } else {
            Node aux = head;
            while(aux.getNext() != null) {
                aux = aux.getNext();
            }
            aux.setNext(new Node(element));
        }
    }

    public void print() {
        /**
         * Afisare pentru fiecare nod:
         *
        Node aux = head;
        while(aux != null) {
            System.out.println(aux);
            aux = aux.getNext();
        }
         */

        System.out.println(head);
    }

    public boolean lookup(T element) {
        Node aux = head;
        while(aux != null) {
            if(aux.getInfo().equals(element)) {
                return true;
            }
            aux = aux.getNext();
        }
        return false;
    }
}
