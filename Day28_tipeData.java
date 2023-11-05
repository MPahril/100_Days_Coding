package day1;

public class Day28_tipeData {
    public static void main(String[] args) {
        String namaDepan = "M. "; 
        String namaBelakang = "Pahril";
        int umur = 21;
        double tinggi = 175.4;
        double beratBadan = 95.5;
        String ukuranBaju = "XXL";
        boolean statusPernikahan = false;
        
        System.out.println("Nama Depan        : "+namaDepan);
        System.out.println("Nama Belakang     : "+namaBelakang);
        System.out.println("Umur Anda         : "+umur);
        System.out.println("Tinggi Anda       : "+tinggi+" Cm");
        System.out.println("Berat Badan       : "+beratBadan+" Kg");
        System.out.println("UKuran Baju       : "+ukuranBaju);
        System.out.println("Status Pernikahan : "+statusPernikahan);
        
        //alasan knapa memakai String karna berbentuk teks
        //alasan knapa memakai int karna berbentuk angka
        //alasan knapa memakai double karna berbentuk bilangan pecahan
        //alasan knapa memakai boolean karna hanya bisa mengakses true atau false
    }
}
