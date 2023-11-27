package day1;

import java.util.Stack;

public class Day50 {
    public static void main(String[] args) {
         Stack<Integer> rill = new Stack<>();// Membuat objek stack dengan tipe data Integer

        
        rill.push(21);// Menambahkan elemen ke dalam stack menggunakan operasi push
        rill.push(24);// Menambahkan elemen ke dalam stack menggunakan operasi push
        rill.push(2);// Menambahkan elemen ke dalam stack menggunakan operasi push
        
        //untuk menampilkan isi stack dengan memanggil objeknya 
        System.out.println("Isi stack: " + rill);
        
    }
}
