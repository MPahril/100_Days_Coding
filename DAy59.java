package day1;

import java.util.Scanner;

public class DAy59 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        int angka = sc.nextInt();
        System.out.println("Angka Yang Habis Di bagi Tiga : ");
        
        boolean angka1 = false;// Jika ada, maka angka1 akan bernilai true
        for (int i = 1; i <= angka; i++) {// Perulangan for untuk iterasi dari 1 sampai angka
            if (i % 3 == 0) {// Mengecek apakah i habis dibagi tiga
                System.out.println(i); // Menampilkan i jika i habis dibagi tiga
                angka1 = true; // Mengubah status angka1 menjadi true
            }
        }

        // Jika angka1 masih bernilai false, maka berarti tidak ada angka yang habis dibagi tiga
        // Maka akan ditampilkan pesan kosong

        if (!angka1) {
            System.out.println("Kosong");
        }
    }
}