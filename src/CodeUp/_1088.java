package CodeUp;

import java.util.Scanner;

public class _1088 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 1; i <= n; i++){
            if (i % 3 == 0){
                continue;
            }
            System.out.printf("%d ", i);
        }
    }
}
