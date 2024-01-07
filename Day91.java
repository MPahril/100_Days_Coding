/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day1;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Day91 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("=== Pengisian Data Karyawan ===");
        System.out.print("Masukkan Nama: ");
        String nama = sc.nextLine();

        System.out.print("Masukkan Usia: ");
        int usia = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Masukkan Alamat: ");
        String alamat = sc.nextLine();

        System.out.print("Masukkan Nomor Telepon: ");
        String nomorTelepon = sc.nextLine();

        // Meminta input data gaji
        System.out.println("=== Pengisian Data Gaji ===");
        System.out.print("Masukkan Gaji Pokok: ");
        int gajiPokok = sc.nextInt();

        System.out.print("Masukkan Tunjangan: ");
        int tunjangan = sc.nextInt();


        int totalGaji = gajiPokok + tunjangan;

     
        System.out.println("\n=== Data Karyawan ===");
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);
        System.out.println("Alamat: " + alamat);
        System.out.println("Nomor Telepon: " + nomorTelepon);

        System.out.println("\n=== Data Gaji ===");
        System.out.println("Gaji Pokok: Rp " + gajiPokok);
        System.out.println("Tunjangan: Rp " + tunjangan);
        System.out.println("Total Gaji: Rp " + totalGaji);

    }
}

