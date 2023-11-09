package day1;

import java.util.Scanner;

public class Day32_belajarArray {
    public static void main(String[] args) {
      String[] namaHewan = new String[10];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan Nama Hewan ke-" + (i + 1) + " : "); 
            String daftarHewan = input.nextLine();
            namaHewan[i] = daftarHewan;
        }
        
        System.out.println("===== Daftar Nama Hewan =====");
        for (int i = 0; i < namaHewan.length; i++) {
            System.out.println((i + 1) + ". " + namaHewan[i]); 
        }
    }
}





