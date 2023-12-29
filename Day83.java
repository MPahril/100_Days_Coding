/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day1;

import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class Day83 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        
        arr.add("ayam");
        arr.add("bebek");
        arr.add("cicak");
        arr.add("domba");
        arr.add("elang");
        arr.add("gajah");
        arr.add("harimau");
        arr.add("ikan");
        arr.add("jerapa");
        arr.add("gurita");

        System.out.println(arr);

        System.out.println("=== Setelah Dihapus Indeks Ke-2 dan Ke-5 ===" );
        System.out.println("Mengahapus Indeks Ke 2 : " + arr.remove(2));
        System.out.println("Mengahapus Indeks Ke 5 : " + arr.remove(5));
        System.out.println(arr);

        System.out.println("Menakses index 1: " + arr.remove(2));
        System.out.println("Mengakses index 6: " + arr.get(6));
        
        System.out.println("Mengubah Nama Objek Dari Indeks Ke 3 Dan 6");
        arr.set(3, "Ular");
        arr.set(6, "Buaya");
        System.out.println(arr);
    }
}

