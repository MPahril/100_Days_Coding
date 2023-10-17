package day1;
import java.util.Scanner;
public class Day9_switchCase {
    public static void main(String[] args) {
       Scanner scan  =  new Scanner(System.in);
        System.out.print("Masukan Angka 1,2,3 untuk Memilih Kendaraan : ");
        int kendaraan = scan.nextInt();
        switch(kendaraan){
            case 1:
                System.out.println("Sepeda");
                break;
            case 2:
                System.out.println("Motor");
                break;
            case 3:
                System.out.println("Mobil");
                break;
            default:
                System.out.println("Pilihan Yg Anda Mau Tidak Tersedia");
        }
    }
}
