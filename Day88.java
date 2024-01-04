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
public class Day88 {
   

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan Kata Sandi: ");
        String pass = in.nextLine();

        if (pass.equalsIgnoreCase("Admin")) {
            System.out.println("Anda Masuk Sebagai Admin");
        } else if (pass.equalsIgnoreCase("User")) {
            System.out.println("Anda Masuk Sebagai User");
        } else {
            System.out.println("Kata Sandi Salah");
        }
        in.close();
    }
}
