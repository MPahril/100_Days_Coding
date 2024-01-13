/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day1;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author LENOVO
 */
public class Day97 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Membuat objek Vector yang menyimpan data bertipe String (merek motor)
        Vector<String> merekMotor = new Vector<>();

        // Meminta pengguna untuk memasukkan merek motor
        System.out.println("Masukkan Merek Motor (Ketik 'Selesai' Untuk Mengakhiri Inputan):");
        while (true) {
            System.out.print("-> ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("Selesai")) {
                break;
            }
            merekMotor.add(input);
        }
        System.out.println("Merek Motor Yang di Input :");
        for (String motor : merekMotor) {
            System.out.println(motor);
        }

    }
}

 
