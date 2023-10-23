package day1;
import java.util.Scanner;
public class Day15_IF_ELSE {
    static public void main(String[] args) {
        //Belajar if else
    char nilai;
    Scanner scan = new Scanner (System.in);
    System.out.print("Masukkan Nilai Anda A sampai E : ");
    nilai = scan.next().charAt(0);
    
    if (nilai == 'A'){
    System.out.println("Pertahankan Nilai Anda");
    }
    else if (nilai == 'B'){
    System.out.println("Harus Lebih Baik Lagi");
    }
    else if (nilai == 'C'){
    System.out.println("Perbanyak Belajar");
    }
    else if (nilai == 'D'){
    System.out.println("Kurangi Main Ceweknya/Nongkrongnya");
    }
    else if (nilai == 'E'){
    System.out.println("Sa Canggo oo,Pi'Guruo");
    }
    else{
    System.out.println("Maaf Nilai Anda Ndangi Terdaftar");
    }
    }
}
