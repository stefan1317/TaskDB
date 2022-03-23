package com.company.Exercise_2_LinkedList;

import com.company.Exercise_2.MyList;

public class Main {
    public static void main(String[] args) {
        /**
         * Am facut un obiect de tip MyLinkedList care contine Integer
         */
        MyLinkedList<Integer> integerList= new MyLinkedList<>();

        integerList.add(2);
        integerList.add(41);
        integerList.add(122334);
        integerList.add(56);
        integerList.add(32);
        integerList.add(1123);
        integerList.add(67);
        integerList.add(126);

        System.out.println("############## CHECK PRINT ##############\n");
        integerList.print();
        System.out.println();

        System.out.println("############## CHECK LOOKUP ##############\n");
        System.out.println(integerList.lookup(2));
        System.out.println(integerList.lookup(3));
        System.out.println(integerList.lookup(1123));
        System.out.println(integerList.lookup(122334));
        System.out.println();


        /**
         * Am facut un obiect de tip MyLinkedList care contine String-uri
         */
        MyLinkedList<String> stringList= new MyLinkedList<>();

        stringList.add("mar");
        stringList.add("banana");
        stringList.add("portocala");
        stringList.add("pruna");
        stringList.add("nuca de cocos");
        stringList.add("mango");
        stringList.add("kiwi");
        stringList.add("mandarina");

        System.out.println("############## CHECK PRINT ##############\n");
        stringList.print();
        System.out.println();

        System.out.println("############## CHECK LOOKUP ##############\n");
        System.out.println(stringList.lookup("nuca de cocos"));
        System.out.println(stringList.lookup("piersica"));
        System.out.println(stringList.lookup("mango"));
        System.out.println();
    }
}
