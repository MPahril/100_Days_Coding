/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day1;

/**
 *
 * @author LENOVO
 */
public class Day94 {
    public static void main(String[] args) {

        int[] bilangan = {80, 50, 8, 200, 39};

        int nilaiDicari = 50;
        boolean ditemukan = false;

        for (int bil : bilangan) {
            if (bil == nilaiDicari) {
                ditemukan = true;
                break;
            }
        }


        if (ditemukan) {
            System.out.println("Nilai " + nilaiDicari + " ditemukan.");
        } else {
            System.out.println("Nilai " + nilaiDicari + " tidak ditemukan.");
        }
    }
}
    
