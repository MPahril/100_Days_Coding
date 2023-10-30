package day1;


public class Day22_belajarArray2D {
    public static void main(String[] args) {
        int [][] rill = {
            {1, 2, 3, 4, 5},
            {6, 7},
            {7, 9, 10, 11},
            {12, 13, 14},
            {15},
        };
        //length Fungsinya untuk Menghitung Panjang baris
        System.out.println("Banyaknya Angka di Baris 1 : Ada "+rill[0].length+" Angka");
        System.out.println("Banyaknya Angka di Baris 2 : Ada "+rill[1].length+" Angka");
        System.out.println("Banyaknya Angka di Baris 5 : Ada "+rill[2].length+" Angka");
        System.out.println("Banyaknya Angka di Baris 4 : Ada "+rill[3].length+" Angka");
        System.out.println("Banyaknya Angka di Baris 5 : Ada "+rill[4].length+" Angka");
    }
}

