package day1;

import java.util.Scanner;

public class Day61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String[] manusia = new String[3];
        
        System.out.println(": Masukkan Nama Teman Anda : ");
        
        System.out.print("Nama Teman Pertama: ");
        manusia[0] = sc.nextLine();
        System.out.print("Nama Teman Kedua  : ");
        manusia[1] = sc.nextLine();
        System.out.print("Nama Teman Ketiga : ");
        manusia[2] = sc.nextLine();
        
        System.out.print("Nama Nama Teman Anda : ");
        System.out.println(manusia[0]+", "+manusia[1]+", "+manusia[2]);
    }
}
