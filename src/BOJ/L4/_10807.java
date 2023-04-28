package BOJ.L4;

import java.util.Scanner;

public class _10807 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // 개수
        int arr[] = new int[n]; // 배열 n개

        int count = 0; // 같은 수
        for(int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int v = scanner.nextInt(); // 찾으려고 하는 수
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == v) {
                count++;
            }
        }

        System.out.println(count);
    }
}
