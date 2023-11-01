package day1;
import java.util.Scanner;
public class Day24_belajarswitchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int nopung;
        boolean nomValid = false;
       
        while (!nomValid){
                    System.out.print("Masukkan Nomor Punggung Anda : ");
                    nopung = scan.nextInt();
        switch (nopung){
            case 21:
                System.out.println("Nomor Punggung Anda Adalah 21");
                nomValid = true;
                break;
            case 22:
                System.out.println("Nomor Punggung Anda Adalah 22");
                nomValid = true;
                break;
            case 23:
                System.out.println("Nomor Punggung Anda Adalah 23");
                nomValid = true;
                break;
            case 24:
                System.out.println("Nomor Punggung Anda Adalah 24");
                nomValid = true;
                break;
            case 25:
                System.out.println("Nomor Punggung Anda Adalah 25");
                nomValid = true;
                break;
            default :
                System.out.println("Nomor Punggung Yang Anda masukkan sudah dimiliki orang lain");
              
        }
       
    }
}
}