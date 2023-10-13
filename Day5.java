package day1;
import java.util.Scanner;
public class Day5 {
    public static void main(String[] args) {
//Operator adalah operasi matematika terhadap data untuk mencapai tujuan tertentu
//Operator Aritmetika adalah operator yang melakukan proses Aritmatika
    Scanner scan = new Scanner (System.in);
        int a, b, c;
        System.out.print("Masukkan Nilai a = ");
        a = scan.nextInt();
        System.out.print("Masukkan Nilai b = ");
        b = scan.nextInt();
        c = a+b;
        System.out.println("Penjumlahan");
        System.out.println(a + " + " + b + " = " + c);
        c = a-b;
        System.out.println("Pengurangan");
        System.out.println(a + " - " + b + " = " + c);
        c = a*b;
        System.out.println("Perkalian");
        System.out.println(b + " x " + a + " = " + c);
        c = a/b;
        System.out.println("Pembagian");
        System.out.println(b + " / " + a + " = " + c);
        c = a%b;
        System.out.println("Sisa Bagi atau Modulus");
        System.out.println(a + " % " + b + " = " + c);
    }
}
