package day1;

import java.util.Scanner;

public class Day51 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah nama: ");//untuk memasukan  jumlah nama yang di cetak
        int jumlahNama = scanner.nextInt();

        System.out.println(": Masukkan Daftar Nama :");// Menampilkan pesan untuk memasukkan daftar nama
        String[] daftarNama = new String[jumlahNama];// membuat array untuk menyimpan nama yang di masukkan 

        
        for (int i = 0; i < jumlahNama; i++) {//untuk mengisi array dengan nama yang dimasukkan

            System.out.print("Nama ke-" + (i + 1) + ": ");//untuk menginput nama dan menyimpan dalam array
            daftarNama[i] = scanner.next();
        }
           
        System.out.println("Daftar nama yang Dimasukkan:");//Menampilkan Daftar nama yang di 

        
        for (int i = 0; i < jumlahNama; i++) {//untuk mengisi array dengan nama yang dimasukkan

            System.out.println("Nama ke-" + (i + 1) + ": " + daftarNama[i]);//untuk mencetak nama dan  indeksnya 
        }
    }
}



