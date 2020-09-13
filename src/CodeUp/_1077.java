package CodeUp;

import java.util.Scanner;

public class _1077 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if(num >= 0 && num <= 100){
            for(int i = 0; i <= num; i++){
                System.out.println(i);
            }
        }
    }
}
