package day1;
import java.util.ArrayList;
import java.util.Scanner;
public class Day73 {
    public static void main(String[] args) {

        ArrayList <Integer> angkaR = new ArrayList<>();
        
        Scanner sc = new Scanner (System.in);
        int total = 0;

        System.out.println("Masukkan angka (0 untuk mengakhiri):");

        while (true) {
            int input = sc.nextInt();

            if (input == 0) {
                break; 
            }

            angkaR.add(input);
            total += input;

            System.out.println("Total penjumlahan: " + total);
        }

        System.out.println("Hasil akhir penjumlahan: " + total);
    
    }
}
  
