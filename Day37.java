package day1;

import java.util.Scanner;

public class Day37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan Angka Pertama : ");
        int angka1 = sc.nextInt();
        System.out.print("Masukkan Angka Kedua   : ");
        int angka2 = sc.nextInt();
        
        int hasil = angka1 * angka2;
        
            if (hasil %2 ==0) {
                System.out.println(hasil +=2);
            }else{
               
                System.out.println(hasil +=5);
            }
           
        }
    }

