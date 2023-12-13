package day1;

import java.util.Scanner;

public class Day66 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah teman : ");
        int teman = sc.nextInt();

        // untuk menyimpan nama teman
        String[] friendsArray = new String[teman];

        //untuk memasukkan nama teman
        System.out.println("Masukkan nama teman :");

        for (int i = 0; i < teman; i++) {
            System.out.print("Teman ke-" + (i + 1) + ": ");
            friendsArray[i] = sc.next();
        }

        // Menampilkan nama teman yang dimasukkan
        System.out.println("Nama teman yang dimasukkan :");
        for (int i = 0; i < teman; i++) {
            System.out.println("Teman ke-" + (i + 1) + ": " + friendsArray[i]);
        }

    
    }
}
    
