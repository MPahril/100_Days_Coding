package day1;

import java.util.Scanner;

public class Day20_belajarInputan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan Nama Anda     : ");
        String nama = scan.nextLine();
        System.out.print("Masukkan Umur Anda     : ");
        int umur = scan.nextInt();
        scan.nextLine(); // Membersihkan karakter newline
        System.out.print("Masukkan Alamat Anda : ");
        String alamat = scan.nextLine();
        System.out.println("========================");
        System.out.println("Nama Anda Adalah\t : " + nama);
        System.out.println("Umur Anda Adalah \t: " + umur + " Tahun");
        System.out.println("Alamat Anda Adalah : " + alamat);
    }
}
