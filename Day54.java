package day1;

import java.util.Scanner;

public class Day54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan Angka A : ");
        int angkaA = sc.nextInt();
        System.out.print("Masukkan angka B : ");
        int angkaB = sc.nextInt();
        
        int hasil = angkaA * angkaB;
        
        System.out.println("Hasil Perkalian angkaA Dan angkaB : "+hasil);
        if (hasil %2 == 0) {
            
            System.out.println("Hasil Genap Yg Habis Di bagi 2 Maka Di Tambah 5 : "+(hasil+=5));
        }else{
            System.out.println("Hasil Ganjil Yg tidak Habis Di bagi 2 Maka Di Tambah 2 : "+(hasil +=2));
        }
    }
}
