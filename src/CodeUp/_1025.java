package CodeUp;

import java.util.Scanner;

public class _1025 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();

        int arr[] = new int[a.length()];
        for(int i=0; i<a.length(); i++){
            arr[i] = a.charAt(i)-'0';
        }
        System.out.println("["+ arr[0]*10000 +"]");
        System.out.println("["+ arr[1]*1000 +"]");
        System.out.println("["+ arr[2]*100 +"]");
        System.out.println("["+ arr[3]*10 +"]");
        System.out.println("["+ arr[4] +"]");
    }
}
