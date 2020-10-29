package BOJ.L3;

import java.util.Scanner;

public class _2439 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = n; j > 0; j--){
                if(j > i){
                    System.out.printf(" ");
                }else{
                    System.out.printf("*");
                }
            }
            System.out.println();
        }
    }
}
