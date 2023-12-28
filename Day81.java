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
public class Day81 {
    public static void main(String[] args) {

        ArrayList arr = new ArrayList();
        
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
        
        System.out.println("=== Stelah Di Hapus Indeks Ke2 dan Ke6 ===" );
        arr.remove(2);
        arr.remove(5);
        System.out.println(arr);
    }
}

  