
package day1;

import java.util.Scanner;

public class Day52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan Jumlah Binatang : ");//untuk memasukan  jumlah nama yang di cetak
        int binatang = sc.nextInt();
        
        System.out.println("Masukkan Nama Binatang : ");// Menampilkan pesan untuk memasukkan daftar nama
        String[] namaBinatang = new String[binatang];// membuat array untuk menyimpan nama yang di masukkan 
        
        for (int i = 0; i < binatang; i++) {//untuk mengisi array dengan nama yang dimasukkan
            System.out.print("Indeks -"+(i+1)+": ");//untuk menginput nama dan menyimpan dalam array
            namaBinatang[i] = sc.next();
        }
        System.out.println(": Nama Nama Binatang Yang Di Input : ");//Menampilkan Daftar nama yang di
        for (int i = 0; i < binatang; i++) {//untuk mengisi array dengan nama yang dimasukkan
            System.out.println("Indeks -"+(i+1)+": "+namaBinatang[i]);//untuk mencetak nama dan nomor ke berapa
        }
    }
   
}
