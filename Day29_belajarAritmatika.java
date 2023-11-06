package day1;
import java.util.Scanner;
public class Day29_belajarAritmatika {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan Panjang Persegi Panjang : ");
        double panjang = sc.nextDouble();
        
        System.out.print("Masukkan Lebar Persegi Panjang : ");
        double lebar = sc.nextDouble();
        
        double luas = panjang * lebar;
        
        double keliling = 2*(panjang + lebar);
        
        System.out.println("Luas Persegi Panjang : "+luas);
        System.out.println("Kelinling Persegi Panjang : "+keliling);
    }
}
