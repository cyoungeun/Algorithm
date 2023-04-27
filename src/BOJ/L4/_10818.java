package BOJ.L4;

import java.util.Scanner;

public class _10818 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int min = arr[0];
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){ // 최솟값
               min = arr[i];
            }
            if(arr[i] > max){ // 최댓값
                max = arr[i];
            }
        }
        System.out.print(min + " " + max);
    }
}
