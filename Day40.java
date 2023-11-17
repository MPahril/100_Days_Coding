package day1;

import java.util.Scanner;

public class Day40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);  
        System.out.print("Masukkan Angka : ");
        int angka = sc.nextInt();
        
        System.out.println("Angka Yang Habis Di bagi Tiga : ");
        boolean angka1 = false;
        for (int i = 1; i <= angka; i++) {
            if (i %3==0) {
                System.out.println(i);
                angka1 = true;
            }}
        if (! angka1) {
            System.out.println("Kosong");
        }
            }
    }

