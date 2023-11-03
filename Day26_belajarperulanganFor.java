package day1;

public class Day26_belajarperulanganFor {
    public static void main(String[] args) {
        int[] angka ={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        System.out.println("==== perulangan for biasa ====");
        for(int i = 0; i<10; i++){
            System.out.println("indeks ke"+i+" adalah = "+angka[i]);
        }
        System.out.println("==== perulangan for menggunakan lenght ====");
        for(int i = 0 ; i<angka.length;i++){
            System.out.println("indeks ke"+i+" adalah = "+angka[i]);
        }
        System.out.println("==== perulangan  for each ====");
        for(int angka1 : angka){
            System.out.println("angka pada perulangan for each = "+angka1);
        }
    }
}
