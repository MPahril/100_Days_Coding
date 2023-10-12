package day1;
import java.util.Scanner;
public class Day4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nama, alamat, pekerjaan, agama;
        int umur;
        double tinggiBadan, beratBadan;
        
        System.out.print("Masukkan Nama           : ");
        nama = scan.nextLine();
        
        System.out.print("Masukkan Alamat         : ");
        alamat = scan.nextLine();
        
        System.out.print("Masukkan Pekerjaan      : ");
        pekerjaan = scan.nextLine();
        
        System.out.print("Masukkan Agama          : ");
        agama = scan.nextLine();
        
        System.out.print("Masukkan Umur           : ");
        umur = scan.nextInt();
        
        System.out.print("Masukkan Tinggi Badan   : ");
        tinggiBadan =  scan.nextDouble();
        
        System.out.print("Masukkan Berat Badan    : ");
        beratBadan = scan.nextDouble();
        
        System.out.println("===============================================");
        System.out.println("Nama Saya "+nama + " Lahir di " + alamat);
        System.out.println("Pekerjaan sebagai "+pekerjaan+" Agama Saya "+agama);
        System.out.println("Umur Saya "+umur+" Tahun");
        System.out.println("Tinggi Badan Saya "+tinggiBadan+" CM");
        System.out.println("BeratBadan Saya "+beratBadan+" KG");
    }
  
}
