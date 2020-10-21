package CodeUp;

import java.util.Scanner;

public class _1091 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int m = scanner.nextInt();
        int d = scanner.nextInt();
        int n = scanner.nextInt();
        long nCount = a;

        for(int i = 1; i < n; i++){
            nCount = nCount * m + d;
        }
        System.out.println(nCount);
    }
}
