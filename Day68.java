package day1;

public class Day68 {
    public static void main(String[] args) {
        int[][] array2D = new int[3][3];

        // Mengisi array 2D
        array2D[0][0] = 1;
        array2D[0][1] = 2;
        array2D[0][2] = 3;
        array2D[1][0] = 4;
        array2D[1][1] = 5;
        array2D[1][2] = 6;
        array2D[2][0] = 7;
        array2D[2][1] = 8;
        array2D[2][2] = 9;

        // Menampilkan isi array 2D
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }
    }
}
 
