
package day1;

public class day2 {
    public static void main(String[] args) {
        //perbedaan primitif dan non primitif
        //Primitif penulisan tipe datanya dimulai dengan huruf kecil
        //non primitif penulisan tipe datanya di mulai dengan huruf besar
        
       //Tipe data primitif       tipe data non primitif
       //1.byte                   1.Byte
       //2.short                  2.Short
       //3.int                    3.Integer
       //4.long                   4.Long
       //5.float                  5.Float 
       //6.double                 6.Double
       //7.chart                  7.Chart
       //8.boolean                8.Boolean
       
    System.out.println ("Program primitif dan non primitif");
    int nilaiPrimitif = 21;
    Integer nilaiPrimitif1 = 21;
    System.out.println("int Primitif : " + nilaiPrimitif);
    System.out.println("Integer Non Primitf : "+nilaiPrimitif1);
    //operasi dengan tipe data int
    int hasilPerkalian = nilaiPrimitif*2;
    System.out.println("Nilai perkalian int primitif : "+hasilPerkalian);
    int hasilPenjumlahan = nilaiPrimitif1+50;
    System.out.println("Nilai penjumlahan Intefer Non primitif : "+hasilPenjumlahan);
    System.out.println("==============================");
    
    short nilaiShort = 2000;
    Short nilaiShort1 = 2000;
    System.out.println("short Primitif : " + nilaiShort);
    System.out.println("Short Non Primitf : "+nilaiShort1);
    //operasi dengan tipe data short
    int hasilPengurangan = nilaiShort-100;
    System.out.println("Nilai perkalian int primitif : "+hasilPengurangan);
    int hasilPembagian = nilaiPrimitif1/2;
    System.out.println("Nilai penjumlahan Intefer Non primitif : "+hasilPembagian);
    System.out.println("==============================");
    
    byte nilaiByte  = 100;
    Byte nilaiByte1 = 100;
    System.out.println("Byte Primitif : " +nilaiByte);
    System.out.println("Byte Non Primitif : " +nilaiByte1);
    System.out.println("==============================");
    
    long nilaiLong = 12345678L;
    Long nilaiLong1=12345678L;
    System.out.println("Nilai Long Primitif : "+nilaiLong);
    System.out.println("Nilai Long Non Primitif : "+nilaiLong1);
    
   
    }
}
