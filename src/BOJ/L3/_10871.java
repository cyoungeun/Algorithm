package BOJ.L3;

import java.util.Scanner;

public class _10871 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();

        for(int i = 1; i <= n; i++){
            int a = scanner.nextInt();
            if(a < x){
                System.out.printf("%d ", a);
            }
        }
    }
}
