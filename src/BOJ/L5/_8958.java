package BOJ.L5;

import java.util.Scanner;

public class _8958 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String oxArr[] = new String[n];

        for(int i = 0; i < n; i++) {
            String ox = scanner.next();

            oxArr[i] = ox;

            int c = 0;
            int sum = 0;

            for(int j = 0; j < oxArr[i].length(); j++) {

                if(oxArr[i].charAt(j) == 'O') {
                    c++;
                }else if(oxArr[i].charAt(j) == 'X'){
                    c = 0;
                }
                sum += c;
            }
            System.out.println(sum);
        }

    }
}
