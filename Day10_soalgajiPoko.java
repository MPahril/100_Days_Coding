package day1;
import java.util.Scanner;
public class Day10_soalgajiPoko {
    public static void main(String[] args) {
        
Scanner scan = new Scanner (System.in);
        System.out.print("Masukkan Golongan Anda (I/II/III): ");
        String golongan = scan.nextLine();

        System.out.print("Masukkan Berapa Lama Anda Kerja: ");
        int lamaKerja = scan.nextInt();

        double gajiPokok = 0;
        switch (golongan) {
            case "I":
                gajiPokok = 4000000;
                break;
            case "II":
                gajiPokok = 7000000;
                break;
            case "III":
                gajiPokok = 10000000;
                break;
            default:
                System.out.println("Golongan tidak valid. Masukkan golongan yang benar (I/II/III).");
                return;
        }

        double bonus = 0;
        if (lamaKerja > 5) {
            bonus = 100000 * (lamaKerja - 5);
        }

        double totalGaji = gajiPokok + bonus;
        System.out.printf("Gaji karyawan adalah: Rp ", totalGaji);
    }
}


