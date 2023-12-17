package day1;

import java.util.HashMap;
import java.util.Scanner;

public class Day70 {
    public static void main(String[] args) {
       
        HashMap<Integer, String> merkHP = new HashMap<Integer, String>();
        merkHP.put(1, "Oppo");
        merkHP.put(2, "Vivo");
        merkHP.put(3, "Samsung");
        merkHP.put(4, "Lenovo");
        merkHP.put(5, "Asus");
        merkHP.put(6, "Realme");
        merkHP.put(7, "Readme");
        System.out.println("Isi objek merkHP sebelum penambahan: " + merkHP);
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nomor merk HP (1-7): ");
        int merkNumber = scan.nextInt();

        System.out.print("Masukkan nama merk HP: ");
        String merkName = scan.next();
        merkHP.put(merkNumber, merkName);
        System.out.println("Isi objek merkHP setelah penambahan: " + merkHP);

    }
}
