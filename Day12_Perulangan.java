package day1;
import java.util.Scanner;
public class Day12_Perulangan {
    public static void main(String[] args) {
        //Perulangan Do/While
        Scanner scan = new Scanner(System.in);
        int angka ;

        do {
            System.out.print("Masukkan Angka = ");
            angka = scan.nextInt();
            System.out.println("Angka yang anda masukkan : "+angka);
        } while ( angka != 34);
        System.out.println("Program Telah Tamat");
    }
}