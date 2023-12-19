package day1;

public class Day72 {
    public static void main(String[] args) {

        System.out.print("Masukkan Angka : ");       
        int angka = sc.nextInt();
        
        int genap = 0;
        int ganjil = 0;
        
        for (int i = 1; i <= angka; i++) {
            if (genap %2==0) {
                genap +=i;
            }else{
                if (ganjil %2==0) {
                    ganjil += i;
                }
            }
        }
        System.out.println("Penjumlahan Angka Genap : "+genap);
        System.out.println("Penjumlahan angka Ganjil : "+ganjil);
    }
}
 