package CodeUp;

import java.util.Scanner;

public class _1083 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if(n > 0 && n <= 10){
            for(int i = 1; i <= n; i++){
                if(i % 3 == 0){
                    System.out.printf("X ");
                }else{
                    System.out.printf("%d ", i);
                }
            }
        }
    }
}
