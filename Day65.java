package day1;

public class Day65 {
    public static void main(String[] args) {
         //Deklarasi array 2 dimensi
        String[][]huruf = {
            {"Lu","Ma","Ti"},
            {"Se","Ka","Rang"},
            {"Ha","Ha","Ha"},        
        };

        //Menampilkan isi array dengan perulangan
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(huruf[i][j]+" ");
            }
            System.out.println();
        }
    }
 }
