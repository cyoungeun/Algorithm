package CodeUp;

import java.util.Scanner;

public class _1049 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();

        if(a > b){
            System.out.println(1);
        }else if(a <= b){
            System.out.println(0);
        }
    }
}
