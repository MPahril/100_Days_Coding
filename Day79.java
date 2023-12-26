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
public class Day79 {
    public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan Angka : ");
        int angka = sc.nextInt();
        
        String hasil;
        
        if (angka >= 90) {
            hasil = "A";     
        }else if (angka >= 80) {
            hasil = "B+";
        }else if (angka>= 70) {
            hasil = "B";
        }else if (angka >= 60) {
            hasil = "C+";
        }else if (angka >= 50) {
            hasil = "C";
        }else if (angka >= 40) {
            hasil = "D";
        }else{
            hasil = "E";
        }
        System.out.println("Nilai Anda Adalah : "+hasil);
    }
}
