package day1;
import java.util.Scanner;
public class Day6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        int nilaiBenar = 21;
        int nilaiTebakan;
        boolean statusTebakan;
        
        System.out.print("Masukkan nilai tebakan anda = ");
        nilaiTebakan = scan.nextInt();
        
        statusTebakan = (nilaiBenar == nilaiTebakan);
        System.out.println("Tebakan Anda : "+statusTebakan);
        
        System.out.print("Masukkan Nilai di antara 10 dan 25 : ");
        nilaiTebakan = scan.nextInt();
        
        statusTebakan = (nilaiTebakan > 10) && (nilaiTebakan<25);
        System.out.println("Tebakan Anda : "+ statusTebakan);
    }
}
