package com.company.Exercise_2;

public class Main {
    public static void main(String[] args) {

        /**
         * Am facut un obiect de tip MyList care contine Integer
         */
        MyList<Integer> integerList= new MyList<>();

        integerList.add(2);
        integerList.add(41);
        integerList.add(2132);
        integerList.add(123);
        integerList.add(32);
        integerList.add(10);
        integerList.add(321);
        integerList.add(12441);

        System.out.println("############## CHECK PRINT ##############\n");
        integerList.print();
        System.out.println();

        System.out.println("############## CHECK LOOKUP ##############\n");
        System.out.println(integerList.lookup(2));
        System.out.println(integerList.lookup(3));
        System.out.println(integerList.lookup(2132));
        System.out.println();


        /**
         * Am facut un obiect de tip MyList care contine String-uri
         */
        MyList<String> stringList= new MyList<>();

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
