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
public class Day95 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan usia: ");
        int umur = sc.nextInt();

        String kategori;

        if (umur < 0) {
            kategori = "Usia tidak valid";
        } else if (umur <= 5) {
            kategori = "Balita";
        } else if (umur <= 12) {
            kategori = "Anak-anak";
        } else if (umur <= 17) {
            kategori = "Remaja";
        } else if (umur <= 27) {
            kategori = "Dewasa";
        } else {
            kategori = "Lansia";
        }

        System.out.println("Kategori usia: " + kategori);

    }
}

