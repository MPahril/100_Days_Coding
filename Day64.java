package day1;

import java.util.ArrayList;

public class Day64 {
    public static void main(String[] args) {
        // membuat objek array list
        ArrayList pahril = new ArrayList();

        // Menambahkan nama
        pahril.add("pahril");
        pahril.add("pahrul");
        pahril.add("pahral");
        pahril.add("pahrol");
        pahril.add("pahrel");
        System.out.println("Sebelum Di Hapus : "+pahril);
        
        // menghapus tikus dari kantong ajaib
        pahril.remove("pahrol");
        System.out.println("Setelah Di Hapus : "+pahril);
 
        // menampilkan banyak isi kantong ajaib
        System.out.println("Menampilkan Banyaknya ArrayList : "+ pahril.size() +" item");
    }
}
    
