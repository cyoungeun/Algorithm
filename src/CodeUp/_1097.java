package CodeUp;

import java.util.Scanner;

public class _1097 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, x, y;
        int a[][] = new int[20][20];

        for (int i = 1; i <= 19; i++){
            for (int j = 1; j <= 19; j++){
                a[i][j] = scanner.nextInt();
            }
        }

        n = scanner.nextInt();

        for (int i = 1; i <= n; i++){
            x = scanner.nextInt();
            y = scanner.nextInt();

            for (int j = 1; j <= 19; j++){
                if(a[x][j] == 0){
                    a[x][j] = 1;
                }else{
                    a[x][j] = 0;
                }

                if(a[j][y] == 0){
                    a[j][y] = 1;
                }else{
                    a[j][y] = 0;
                }
            }
        }

        for (int i = 1; i <= 19; i++){
            for (int j = 1; j <= 19; j++){
                System.out.printf("%d ", a[i][j]);
            }
            System.out.println();
        }
    }
}
