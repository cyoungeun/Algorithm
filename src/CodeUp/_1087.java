package CodeUp;

import java.util.Scanner;

public class _1087 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;

        for(int i = 1; ; i++){
            sum = sum + i;
            if(sum >= n){
                break;
            }
        }
        System.out.println(sum);
    }
}
