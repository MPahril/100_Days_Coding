package day1;

import java.util.Scanner;

public class Day38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan Angka  : ");
        int angka = sc.nextInt();
        
        for (int i = angka; i >= 1 ; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        for (int i = 1; i <= angka; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
}
}

