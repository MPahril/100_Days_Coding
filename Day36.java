package day1;

import java.util.Scanner;

public class Day36 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Angka Pertama : ");
        int angka1 = sc.nextInt();
        System.out.print("Masukkan Angka Kedua : ");
        int angka2 = sc.nextInt();

        int jumlah = angka1 + angka2;
//        int total = 0;
//        if (jumlah % 2 == 0) {
//            total = jumlah + 1;
// //
//       } else {
//            total = jumlah + 2;
//        }
//        
//        System.out.println(total);
        
       
       int genap = 1;
       int ganjil = 2;
        
        if (jumlah % 2==0) {
            System.out.println("Hasil Genap : "+jumlah);
            System.out.println("Hasil Genap Di Tambah 1 :"+(jumlah+genap));
        }else{
            System.out.println("Hasil Ganjil : "+jumlah);
            System.out.println("Hasil Ganjil Di Tambah 2 : "+(jumlah+ganjil));
        }

    }
}
