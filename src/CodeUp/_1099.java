package CodeUp;

import java.util.Scanner;

public class _1099 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a[][] = new int[10][10];
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                a[i][j] = scanner.nextInt();
            }
        }

        int x = 1;
        int y = 1;

        while (x < 10 && y < 10){
            if (a[x][y] == 2){
                a[x][y] = 9;
                break;
            }

            if (a[x][y+1] == 1){ // 오른쪽이 벽
                if (a[x+1][y] == 1){ // 아래도 벽
                    break;
                }else{ // 아래가 벽 아닐때
                    x++;
                }
            }else if (a[x][y+1] != 1){ // 오른쪽이 벽 아닐때
                y++;
            }

            if (a[x][y] == 2){
                a[x][y] = 9;
                break;
            }

            a[x][y] = 9;
        }

        a[1][1] = 9; // 개미 출발

        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                System.out.printf("%d ", a[i][j]);
            }
            System.out.println();
        }
    }
}