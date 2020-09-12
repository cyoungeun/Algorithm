package CodeUp;

import java.util.Scanner;

public class _1068 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if(a >= 90 && a <= 100){
            System.out.println("A");
        }else if(a >= 70){
            System.out.println("B");
        }else if(a >= 40){
            System.out.println("C");
        }else if(a >= 0){
            System.out.println("D");
        }
    }
}
