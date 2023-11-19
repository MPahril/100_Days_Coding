package day1;

import java.util.Scanner;

public class Day42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan A : ");
        int a = sc.nextInt();
        System.out.print("Masukkan B : ");
        int b = sc.nextInt();

        int c = a * b;

        int d;

        if (c % 2 == 0 && c - 3 != 0) {
            d = c * 2;
        } else {
            d = c + 2;
        }
        System.out.println("Hasil Perkalian A dan B : "+c);
            System.out.println("Hasil Akhir D : "+d);
        }
    }

