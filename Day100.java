package day1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day100 {
    public static void main(String[] args) {

        Queue<String> kartuQueue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Masukkan Pilihan:");
            System.out.println("1. Masukkan Nomor HP");
            System.out.println("2. Hapus Nomor HP");
            System.out.println("3. Tampilkan Nomor HP");
            System.out.println("4. Keluar");

            System.out.print("Pilih Menu (1-4): ");
            int kartu = scanner.nextInt();
            scanner.nextLine(); 

            switch (kartu) {
                case 1:
                    System.out.print("Masukkan Nomor HP Anda: ");
                    String nomorHP = scanner.nextLine();
                    kartuQueue.add(nomorHP);
                    System.out.println(nomorHP + " Nomor Anda Tersimpan.");
                    break;
                case 2:
                     System.out.println("Nomor Telepon Anda: " + kartuQueue);
                    break;
                case 3:
                   if (!kartuQueue.isEmpty()) {
                        String hapusNomor = kartuQueue.poll();
                        System.out.println(hapusNomor + " Nomor HP Anda Telah Di Hapus.");
                    } else {
                        System.out.println("Nomor HP Kosong. Tidak Ada Nomor HP Untuk Dihapus.");
                    }
                    break;
                case 4:
                    System.out.println("Program Selesai.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih antara 1-4.");
                    break;
            }
        }
    }
}
