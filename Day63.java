package day1;

import java.util.LinkedList;

public class Day63 {
    public static void main(String[] args) {
    LinkedList<String> update = new LinkedList<>();
     update.add("Pahril");
     update.add("Pahrul");
     update.add("Pahrel");
        System.out.println("setelah di tambahkan : "+update);
        update.add(2,"pahrol");
        System.out.println("Menambahkan elemen Pada Indeks ke dua : "+update);
    }
}