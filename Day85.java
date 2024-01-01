package day1;

import java.util.Scanner;

public class Day85 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        int angka = sc.nextInt();

        for (int i = 1; i <= angka; i++) {
            // Print spaces for the left side of the house
            for (int j = i; j < angka; j++) {
                System.out.print(" ");
            }

            // Print asterisks for the roof of the house
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Print the walls of the house
        for (int i = 1; i <= angka; i++) {
            System.out.print("|");
            for (int j = 1; j <= (2 * angka - 2); j++) {
                System.out.print("-");
            }
            System.out.println("|");
        }
    }
}
