package day1;
import java.util.Scanner;
public class Day14_inputan_dan_aritmatika {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Angka Pertama : ");
        int angkaPertama = scan.nextInt();
        
        System.out.print("Masukkan Angka Kedua   : ");
        int angkaKedua = scan.nextInt();
        System.out.println("========================");
        int penjumlahan = angkaPertama + angkaKedua;
        int perkalian = angkaPertama * angkaKedua;
        int pengurangan = angkaPertama - angkaKedua;
        int pembagian = angkaPertama / angkaKedua;
        int modulus = angkaPertama % angkaKedua;
        
        System.out.println(" Hasil Penjumlahan : "+penjumlahan);
        System.out.println(" Hasil Perkalian   : "+perkalian);
        System.out.println(" Hasil Pengurangan : "+pengurangan);
        System.out.println(" Hasil Pembagian   : "+pembagian);
        System.out.println(" Hasil  Bagi       : "+modulus);
    }
 
}
