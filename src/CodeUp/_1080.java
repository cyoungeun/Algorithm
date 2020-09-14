package CodeUp;

import java.util.Scanner;

public class _1080 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int i = 0;

        if(n >= 0 && n <= 1000) {
            while (sum < n){
                i++;
                sum = sum + i;
            }
        }
        System.out.println(i);

    }
}
