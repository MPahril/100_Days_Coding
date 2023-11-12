package day1;

import java.util.Scanner;

public class Day35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan Angka : ");
        
        int angka = sc.nextInt();
        
        int genap = 0;
        int ganjil = 0;
        
        for (int i = 1; i <= angka; i++) {
            if (i % 2 == 0) {
                genap +=i;
            }else{
                ganjil += i;
            }
        }
        System.out.println("Angka Genap : "+genap);
        System.out.println("Angka Ganjil : "+ganjil);
    }
}
