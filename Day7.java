package day1;
import java.util.Scanner;
public class Day7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Masukkan jumlah pembelian : ");
        double pembeli = scan.nextDouble();
        System.out.println("Belanja = Rp. "+ pembeli);
        if(pembeli >= 5000000){
            System.out.println("Dapat Diskon 20% ");
            double diskon = 20 * pembeli / 100;
            pembeli -= diskon;
        }else if (pembeli >= 250000){
            System.out.println("Dapat diskon 15%");
            double diskon = 15*pembeli/100;
            pembeli -= diskon;
        }else if(pembeli >= 100000){
            System.out.println("Dapat diskon 10%");
            double diskon = 10*pembeli/100;
            pembeli -= diskon;
        }
        else{
            System.out.println("Tidak dapat diskon");
        }
        System.out.println("Akhir = Rp. "+pembeli);
    }
}
