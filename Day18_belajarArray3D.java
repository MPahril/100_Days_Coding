package day1;

public class Day18_belajarArray3D {
    public static void main(String[] args) {
        int [][][] ary = new int [2][2][2];
        
        ary [0][0][0] = 21;
        ary [0][0][1] = 22;
        ary [0][1][0] = 23;
        ary [0][1][1] = 24;
        ary [1][0][0] = 25;
        ary [1][0][1] = 26;
        ary [1][1][0] = 27;
        ary [1][1][1] = 28;
        System.out.println(": Isi Array 3D :");
        System.out.println("=================");
        
    System.out.println("Element di ary [0][0][0]: "+ ary[0][0][0]);
    System.out.println("Element di ary [0][0][1]: "+ ary[0][0][1]);
    System.out.println("Element di ary [0][1][0]: "+ ary[0][1][0]);
    System.out.println("Element di ary [0][1][1]: "+ ary[0][1][1]);
    System.out.println("Element di ary [1][0][0]: "+  ary[1][0][0]);
    System.out.println("Element di ary [1][0][1]: "+ ary[1][0][1]);
    System.out.println("Element di ary [1][1][0]: "+ ary[1][1][0]);
    System.out.println("Element di ary [1][1][1]: "+ ary[1][1][1]);
    }
}
