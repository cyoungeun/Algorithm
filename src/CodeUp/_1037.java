package CodeUp;

import java.util.Scanner;

public class _1037 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        char b = (char)a;
        if(a >= 0 && a <= 255){
            System.out.println(b);
        }
    }
}
