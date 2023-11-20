package day1;


public class Day43 {

    public static void main(String[] args) {
        System.out.println("Angka Yang Habis Di Bagi Lima : ");
        for (int i = 1; i <= 100; i++) {
            if (i % 2==0&& i %5 ==0) {
                System.out.println(i);
            }
        }
    }
}
        


