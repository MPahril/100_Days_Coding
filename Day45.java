package day1;

public class Day45 {
    public static void main(String[] args) {
        int [] angka ={25, 54,21,24}; 
        System.out.println("Mengakses Indeks : "+angka[3]);
        
        angka[3]=78;
        System.out.println("angka yang di ubah : "+angka[3]);
        
        System.out.println("Mengakses Semua Elemen : ");
        for (int i = 0; i <angka.length; i++) {
            System.out.println(angka[i]);
        }
    }
 
}
