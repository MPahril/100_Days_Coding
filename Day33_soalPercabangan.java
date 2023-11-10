package day1;

import java.util.Scanner;

public class Day33_soalPercabangan {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");  
        int angka = scanner.nextInt();
        if (angka % 3 == 0 && angka % 5 == 0) {
            System.out.println("Master Class");
         }else if (angka % 3 == 0) {
            System.out.println("Pride of 3");
       }else if (angka % 5 == 0) {
            System.out.println("Pride of 5");
        }else{
            System.out.println("Angka tidak dapat di bagi 3 atau 5");
        }
         }
        }

