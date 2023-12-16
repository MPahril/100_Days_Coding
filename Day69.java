package day1;

public class Day69 {
    public static void main(String[] args) {
      
        // Membuat array 3D
        int[][][] array3D = {
                {{1, 2, 3}, {4, 5, 6}},
                {{7, 8, 9}, {10, 11, 12}},
                {{13, 14, 15}, {16, 17, 18}}
        };

        // Menampilkan array 3D
        System.out.println("Isi Array 3D:");
        ayArray3D(array3D);
    }

    // Metode untuk menampilkan array 3D
    public static void ayArray3D(int[][][] array3D) {
        for (int i = 0; i < array3D.length; i++) {
            for (int j = 0; j < array3D[i].length; j++) {
                for (int k = 0; k < array3D[i][j].length; k++) {
                    System.out.print(array3D[i][j][k] + " ");
                }
                System.out.println(); // Pindah baris setelah setiap baris kedalaman
            }
            System.out.println(); // Pindah baris setelah setiap baris kolom
        }
    }
}

   
