package day1;

import java.util.Scanner;


public class Day57{
    
    
    public static void main(String[] args) {
        
        
        Scanner scan = new Scanner(System.in);
        
        // Mendeklarasikan variabel 'matkul' untuk menyimpan nama mata kuliah
        String matkul;
        
        // Meminta pengguna untuk memasukkan nama mata kuliah
        System.out.print("Masukkan Matakuliah Anda : ");
        matkul = scan.nextLine();
        
        // Menggunakan pernyataan switch untuk memeriksa nama mata kuliah dan memberikan informasi yang sesuai
        switch (matkul) {
            case "Cloud Computing":
                System.out.println("Matkul Cloud Computing, Masuk Di Lab 1");
                break;
            case "Grafika Komputer":
                System.out.println("Matkul Grafika Komputer, Masuk Di lab 2");
                break;
            case "Pemprograman jaringan":
                System.out.println("Matkul Pemprograman Jaringan, Masuk Secara Online");
                break;
            case "Proyek Perangkat Lunak":
                System.out.println("Matkul Proyek Perangkat Lunak, Masuk di Gedung Kembar");
                break;
            default:
                // Jika input tidak cocok dengan kasus manapun, cetak pesan default
                System.out.println("Maaf Matakuliah Yang Anda Masukkan Tidak Tersedia");
        }
    }
}
