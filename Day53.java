package day1;

import java.util.Scanner;

public class Day53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {//untuk meminta input angka tak terbatas jika outputnya tidak sesuai
            System.out.print("Masukkan angka: ");  
            int angka = scanner.nextInt();
            
            // Memeriksa apakah angka dapat dibagi habis oleh 3 dan 5
            if (angka % 3 == 0 && angka % 5 == 0) {//untuk mengecek apakah angka habis di bagi 3 dan 5
                System.out.println("Master Class");
                break;//untuk menghentikan ketika outputnya sudah sesuai
            } else if (angka % 3 == 0) {//jika angka habis di bagi 3 maka muncul Pride Of 3
                System.out.println("Pride of 3");
                break;//untuk menghentikan ketika outputnya sudah sesuai
            } else if (angka % 5 == 0) {//jika angka habis di bagi 5 maka muncul Pride Of 5
                System.out.println("Pride of 5");
                break;//untuk menghentikan ketika outputnya sudah sesuai
            } else {
                // Jika angka tidak dapat dibagi habis oleh 3 atau 5 maka akan muncul seperti di bawah 
                System.out.println("Angka tidak dapat di bagi 3 atau 5");
            }
        }
    }
}
