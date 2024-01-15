/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day1;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Day99 {
    public static void main(String[] args) {

        LinkedList<String> daftarBuah = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Buah: ");
        int jumlahBuah = sc.nextInt();

        for (int i = 1; i <= jumlahBuah; i++) {
            System.out.print("Masukkan Nama Buah Ke-" + (i + 1) + " : ");
            String namaBuah = sc.next();
            daftarBuah.add(namaBuah);
        }

        System.out.print("Nama Buah Dalam Inputan : ");
        for (String buah : daftarBuah) {
            System.out.print(buah + " ");
        }
    }
}

 
