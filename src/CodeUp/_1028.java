package CodeUp;

import java.util.Scanner;

public class _1028 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        if(x >= 0 && x <= 4294967295L){
            System.out.printf("%d", x);   
        }
    }
}