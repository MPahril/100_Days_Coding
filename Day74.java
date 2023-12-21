package day1;

import java.util.Scanner;

public class Day74 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        int angka1 = scanner.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = scanner.nextInt();

        System.out.print("Masukkan angka ketiga: ");
        int angka3 = scanner.nextInt();

        if (angka1 % angka3 == 0) {
            double hasil = angka1 / angka3 + 2;
            System.out.println("Hasil: " + hasil);
        } else if (angka1 % angka2 == 0) {
            int hasil = angka1 / angka2 - 2;
            System.out.println("Hasil: " + hasil);
        } else {
            System.out.println("Kondisi tidak terpenuhi.");
        }

    }
}
 
}
