package BOJ.L9;

import java.util.Scanner;

public class _1978 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int arr[] = new int[t];

        int count = 0; // 소수의 개수
        boolean flag; // 소수 아닌 수 판별해줄 변수

       for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            arr[i] = n; // 입력받은 값 arr 배열에 저장
            flag = true;

            for (int j = 2; j < arr[i]; j++) {

                // 입력 받은 값을 2 ~ arr[i]-1 로 나눌 때 나누어 떨어지는 수 있는지 판별
                if (arr[i] % j == 0) { // 소수가 아닌 수
                    flag = false; // 제외하기 위해 false
                    break;
                }
            }

            if(arr[i] > 1 && flag == true) { // 소수는 1이 포함 안됨, flag 값이 true일 때
                count++;
            }
        }

        System.out.println(count);
    }
}

