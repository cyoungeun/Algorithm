package BOJ.L5;

import java.util.Scanner;

public class _2562 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numArr[] = new int[9];
        int max = numArr[0];
        int index = 0;

        for(int i = 0; i < numArr.length; i++) {
            int n = scanner.nextInt();
            numArr[i] = n;

            if(numArr[i] > max) {
                max = numArr[i];
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index + 1);
    }
}
