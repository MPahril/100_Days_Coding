package day1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * author LENOVO
 */
public class Day98 {

    public static void main(String[] args) {
        // Membuat objek HashMap dengan kunci String (nama sabun) dan nilai String (jenis sabun)
        Map<String, String> sabunMandi = new HashMap<>();

        // Menambahkan beberapa sabun ke dalam HashMap
        sabunMandi.put("Lifebuoy", "Bagus");
        sabunMandi.put("Dove", "Mantap");
        sabunMandi.put("Lux", "Luar Biasa");

        // Membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama sabun mandi: ");
        String namaSabun = scanner.nextLine();

        // Memeriksa apakah sabun tersebut ada dalam HashMap
        if (sabunMandi.containsKey(namaSabun)) {
            // Mendapatkan dan mencetak jenis sabun
            String jenisSabun = sabunMandi.get(namaSabun);
            System.out.println("Jenis sabun untuk " + namaSabun + " adalah " + jenisSabun);
        } else {
            System.out.println("Sabun dengan nama " + namaSabun + " tidak ditemukan.");
        }
    }
}
