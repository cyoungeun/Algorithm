package CodeUp;

import java.util.Scanner;

public class _1089 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int d = scanner.nextInt();
        int n = scanner.nextInt();
        int nCount = 0;

        for(int i = 0; i < n; i++){
            nCount = a + (i * d);
        }
        System.out.println(nCount);
    }
}
