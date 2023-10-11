
package day1;

public class Day3 {
    public static void main(String[] args) {
    System.out.println("Konversi  String ke tipe data primitif");
    System.out.println("=========================");
    //konversi String ke int
    String nilaiString = "211";
    int nilai = Integer.parseInt(nilaiString);
    System.out.println("Nilai String ke int: "+nilai);
    System.out.println("=========================");
    //Konversi String ke Double
    String nilaiString1 = "2.11";
    double nilai1 = Double.parseDouble(nilaiString1);
    System.out.println("Nilai String ke Double : " + nilai1);
    System.out.println("=========================");
    //Konversi String ke Float
    String nilaiString2 = "2.1";
    float nilai2 = Float.parseFloat(nilaiString2);
    System.out.println("Nilai String ke Float : " + nilai2);
    System.out.println("=========================");
    //Konversi String ke Boolean
    String copyPaste = "false";
    boolean ygBenar = Boolean.parseBoolean(copyPaste);
    System.out.println("Apakah anda Copy Paste : " + ygBenar);
    System.out.println("=========================");
    
    System.out.println("Konversi tipe data primitif ke String");
    System.out.println("=========================");
    //konversi Int ke String
    int angkaString = 241;
    String angka = Integer.toString(angkaString);
    System.out.println("Nilai String ke int: "+angka);
    System.out.println("=========================");
    //konversi double ke String
    double angkaString1 = 2.41;
    String angka1 = Double.toString(angkaString1);
    System.out.println("Nilai String ke Double : " + angka1);
    System.out.println("=========================");
    //konversi boolean ke String
    boolean copyPaate1 = false;
    String ygBenar1 = Boolean.toString(copyPaate1);
    System.out.println("Apakah Anda Copy Paste : " +ygBenar1);
    System.out.println("=========================");
    //konversi char ke String
    char golonganDarah = 'O';
    String golongan = Character.toString(golonganDarah);
    System.out.println("Golongan Darah Anda Adalah : "+golongan);
    }
}
