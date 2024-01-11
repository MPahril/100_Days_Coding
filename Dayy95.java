/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day1;

import java.util.HashSet;

/**
 *
 * @author LENOVO
 */
public class Dayy95 {
    public static void main(String[] args) {
        HashSet<String> teman = new HashSet<>();
        System.out.println("== Daftar Nama Teman ==");
        teman.add("Pahril");
        teman.add("Erwin");
        teman.add("Randi Saputra");
        teman.add("Mursalim");
        teman.add("Arjuna"); 
        System.out.println("Daftar Daftar Teman : " + teman);
        
        System.out.println("Jumlah elemen dalam teman: " + teman.size());

        teman.remove("Mursalim");
        System.out.println("Setelah menghapus 'Mursalim': " + teman);
        
        
        teman.clear();
        System.out.println("Setelah membersihkan semua elemen: " + teman);
    }
}

