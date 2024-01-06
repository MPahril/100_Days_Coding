/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day1;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Day90 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);   
    
        int hasil = 0;
        
        System.out.print("Masukkan Angka Pertama : ");
        int angka1 = input.nextInt();
        
        System.out.print("Masukkan Operator : ");
        char operator = input.next().charAt(0);

        System.out.print("Masukkan Angka Kedua   : ");
        int angka2 = input.nextInt();
        
        if (operator == '+'){
            hasil = angka1 + angka2;
            System.out.println("Hasilnya Adalah : "+hasil);
        }
        else if (operator == '-'){
            hasil = angka1 - angka2;
            System.out.println("Hasilnya Adalah : "+hasil);
        }
        else if (operator == '*'){
            hasil = angka1 * angka2;
            System.out.println("Hasilnya Adalah : "+hasil);
        }
        else if (operator == '/'){
            hasil = angka1 / angka2;
            System.out.println("Hasilnya Adalah : "+hasil);
        }
        else if(operator == '%'){
            hasil = angka1 % angka2;
            System.out.println("Hasilnya Adalah : "+hasil);
        }
        else {
            System.out.println("Sistem tidak mengetahui operator yang anda gunakan");
        }
        
        
    }
    
}
  
