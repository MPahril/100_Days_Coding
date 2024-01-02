package day1;
import java.util.Scanner;

public class Day86 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int batas;
        boolean inputValid = false;

        while (!inputValid) {
            System.out.println("Masukkan Banyaknya Angka Ganjil untuk Membuat Sebuah Pola: ");
            batas = in.nextInt();

            if (batas % 2 == 1) {
                inputValid = true; // Keluar dari loop jika angka ganjil
                // Pola atas
                for (int i = 0; i <= batas; i++) {
                    for (int j = batas; j > i; j--) {
                        System.out.print(" ");
                    }
                    for (int k = 0; k < 2 * i + 1; k++) {
                        System.out.print("+");
                    }
                    System.out.println();
                }

                // Pola bawah
                for (int i = batas - 1; i >= 0; i--) {
                    for (int j = i; j < batas; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 0; k < 2 * i + 1; k++) {
                        System.out.print("$");
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Masukkan Angka Ganjil");
            }
        }
    }
}
