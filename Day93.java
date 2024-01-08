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
public class Day93 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan angka Pertama : ");
        int a = sc.nextInt();
        System.out.print("Masukkan angka Kedua : ");
        int b = sc.nextInt();
        
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        System.out.println("Mencari angka Minimal Dan Maxcimal ");
        
        System.out.println("Nilai MIN: " + min);
        System.out.println("Nilai MAX: " + max);
 
    }
}


