package CodeUp;

import java.util.Scanner;

public class _1081 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m;
        n = scanner.nextInt();
        m = scanner.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                System.out.println(i+" "+j);
            }
        }
    }
}
