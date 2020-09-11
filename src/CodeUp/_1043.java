package CodeUp;

import java.util.Scanner;

public class _1043 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();

        if(a >= 0 && b > 0){
            int data = a%b;
            System.out.println(data);
        }
    }
}
