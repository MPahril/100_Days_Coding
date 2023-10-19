package day1;
import java.util.Scanner;
public class Day11_soalPemesanan {
    public static void main(String[] args) {
        System.out.println("Menu Makanan");
        System.out.println("1. Nasi Kuning      = Rp. 5000 ");
        System.out.println("2. Nasi Ayam Crispy = Rp, 15000 ");
        System.out.println("3. Nasi Goreng      = Rp. 13000");
        System.out.println("4. Nasi Campur      = Rp. 12000");
        System.out.println("===============================");
    Scanner scan = new Scanner(System.in);
        int harga = 0;
        
        System.out.print("Masukkan Angka 1,2,3,4, Untuk memilih  Menu Makanan :  ");
        int menu = scan.nextInt();
        
        System.out.print("Jumlah Beli : ");
        int jumlah = scan.nextInt();
        System.out.println("=========================");
        
        if (menu == 1){
            harga = 5000 * jumlah;
        }else if (menu == 2 ){
            harga = 15000 * jumlah;
        }else if (menu == 3 ){
            harga = 13000 * jumlah;
        }else if (menu == 4){
            harga = 12000 * jumlah;
}
        System.out.println("Menu yang dipesan  \t:" + menu);
        System.out.println("Jumlah Pesanan \t:" + jumlah);
        System.out.println("===========================");
        System.out.println("Total Pembayaran : \t:"+harga);
}
}
