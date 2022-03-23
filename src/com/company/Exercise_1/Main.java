package com.company.Exercise_1;

public class Main {

    public static void main(String[] args) {

        /**
         * IMPORTANT! Am facut o noua clasa catalog in care sa pot stoca acel hashmap pentru note, cred ca e mai ok
         * sa fie intr-o clasa separata pentru a-i putea adauga si metodele ce insereaza elevii in hashmap
         */
	    Catalog catalog = new Catalog();

        Student student1 = new Student("Mihai", 7.5f);
        Student student2 = new Student("Ion", 4.5f);
        Student student3 = new Student("Mirel", 9.3f);
        Student student4 = new Student("Matei", 4.86f);
        Student student5 = new Student("Cristian", 9);
        Student student6 = new Student("Alin", 6.3f);
        Student student7 = new Student("Stefan", 10);
        Student student8 = new Student("Stefan", 8);

        catalog.addInCatalog(student1);
        catalog.addInCatalog(student2);
        catalog.addInCatalog(student3);
        catalog.addInCatalog(student4);
        catalog.addInCatalog(student5);
        catalog.addInCatalog(student6);
        catalog.addInCatalog(student7);
        catalog.addInCatalog(student8);

        System.out.println("############# AM VERIFICAT DACA IN TREESET-UL SPECIFIC NOTEI 8 A PUS ELEVUL" +
                "CU NOTA 8 SI PE CEL CU NOTA 7.5\n");

        System.out.println(catalog.getCatalog().get(8));
        System.out.println();

        System.out.println("############# AM VERIFICAT DACA IN TREESET-UL SPECIFIC NOTEI 5 A PUS ELEVUL" +
                "CU NOTA 4.5 SI PE CEL CU NOTA 4.86\n");

        System.out.println(catalog.getCatalog().get(5));
        System.out.println();

        System.out.println("############# AM VERIFICAT DACA IN TREESET-UL SPECIFIC NOTEI 9 A PUS ELEVUL" +
                "CU NOTA 9 SI PE CEL CU NOTA 9.3\n");

        System.out.println(catalog.getCatalog().get(9));
        System.out.println();

        System.out.println("############# AM VERIFICAT DACA IN TREESET-UL SPECIFIC NOTEI 10 SI 6 S-AU ADAUGAT" +
                "BINE ELEVII\n");

        System.out.println(catalog.getCatalog().get(10));
        System.out.println(catalog.getCatalog().get(6));
        System.out.println();
    }
}
