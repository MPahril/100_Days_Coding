package day1;
import java.util.Scanner;

public class Day16_Latihan {
    public static void main(String[] args) {
   Scanner scan = new Scanner (System.in);
        System.out.print("Masukkan Golongan Anda (I,II,III) : ");  
        String golongan = scan.nextLine();
        
        System.out.print("Masukan Lama Anda Bekerja : ");
        int lamaKerja = scan.nextInt();
        
        int gaji = 0;
        switch (golongan){
        case "I":
            gaji = 4000000;
        break;
        case "II":
            gaji = 7000000;
        break;
        case "III":
            gaji = 10000000;
        break;
        default:
            System.out.println("Golongan Anda Masukkan tidak tersedia");
            return;
        }
        int bonus = 0;
        if (lamaKerja > 5){
        bonus = 100000 * (lamaKerja - 5);
    }
        int totalGaji = gaji + bonus;
        System.out.println("Gaji karyawan adalah : "+totalGaji);
    }
}
