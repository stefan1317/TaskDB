package com.company.Exercise_1;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Catalog {
    private HashMap<Integer, TreeSet<Student>> catalog = new HashMap<>();

    public Catalog() {
        for (int i = 0; i < 11; i++){
            this.catalog.put(i, null);
        }
    }

    public HashMap<Integer, TreeSet<Student>> getCatalog() {
        return catalog;
    }

    public void setCatalog(HashMap<Integer, TreeSet<Student>> catalog) {
        this.catalog = catalog;
    }

    public void printCatalog(){
        for (Map.Entry<Integer, TreeSet<Student>> entry : catalog.entrySet())
            System.out.println("Nota" + entry.getKey() + " a fost obtinuta de:" + entry.getValue());
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "catalog=" + catalog +
                '}';
    }

    /**
     * Am facut aceasta metoda pentru a adauga direct elevii in hashmap, am luat cazul in care diferenta dintre
     * partea intreaga si partea fractionara este mai mica sa egala cu 0.5, in cazul ala am crescut nota elevilor cu un
     * punct, iar in caz contrar am lasat-o asa. Am avut totodata inca 2 posibilitati: cazul in care TreeSet-ul era gol,
     * in cazul asta am initializat un TreeSet si am adaugat elementul, iar in caz contrar doar l-am adaugat.
     */
    public void addInCatalog(Student student){
        float part = student.getGrade() - (int) student.getGrade();
        if(part >= 0.5) {
            if(this.catalog.get((int) student.getGrade() + 1) == null) {
                this.getCatalog().put((int) student.getGrade() + 1, new TreeSet<Student>(new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        if(o1.getGrade() < o2.getGrade()) {
                            return 1;
                        } else if(o1.getGrade() > o2.getGrade()) {
                            return -1;
                        } else {
                            return 0;
                        }
                    }
                }));
                this.getCatalog().get((int) student.getGrade() + 1).add(student);
            } else {
                this.getCatalog().get((int) student.getGrade() + 1).add(student);
            }
        } else {
            if(this.catalog.get((int) student.getGrade()) == null) {
                this.getCatalog().put((int) student.getGrade(), new TreeSet<Student>(new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        if(o1.getGrade() < o2.getGrade()) {
                            return 1;
                        } else if(o1.getGrade() > o2.getGrade()) {
                            return -1;
                        } else {
                            return 0;
                        }
                    }
                }));
                this.getCatalog().get((int) student.getGrade()).add(student);
            } else {
                this.getCatalog().get((int) student.getGrade()).add(student);
            }
        }
    }
}
