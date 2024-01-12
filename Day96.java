package day1;

import java.util.Scanner;
import java.util.Stack;

public class Day96 {
    public static void main(String[] args) {
        Stack<String> nmaGuru = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama Guru Pertama: ");
        String guru1 = scanner.nextLine();
        nmaGuru.push(guru1);

        System.out.print("Masukkan Nama Guru kedua: ");
        String guru2 = scanner.nextLine();
        nmaGuru.push(guru2);

        System.out.print("Masukkan Nama Guru ketiga: ");
        String guru3 = scanner.nextLine();
        nmaGuru.push(guru3);

        System.out.println("Nama Guru Teratas: " + nmaGuru.peek());

        System.out.println("Nama Guru Yang Di Hapus: " + nmaGuru.pop());

        System.out.print("Isi Stack Nama Guru : ");
        while (!nmaGuru.isEmpty()) {
            System.out.print(nmaGuru.pop() + " " );
        }
    }
}
