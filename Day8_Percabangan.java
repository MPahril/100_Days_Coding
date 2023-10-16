package day1;
import java.util.Scanner;
public class Day8_Percabangan {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in); 
     int nilai;
     String hasil;
        System.out.print("Masukkan Nilai Anda : ");
        nilai = scan.nextInt();
        if (nilai >= 90){
            hasil = "A";
        }else if(nilai >= 80){
            hasil = "B+";
        }else if(nilai >= 70){
            hasil = "B";
        }else if(nilai >= 60){
            hasil = "C+";
        }else if(nilai >= 50){
            hasil = "C";
        }else if(nilai >= 40){
            hasil = "D";
        }else{
            hasil = "E";
        }
        System.out.println("Hasil Nilai Anda : "+hasil);
    }
  
}
