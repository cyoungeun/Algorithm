package BOJ.L0;

public class _4673 {
    // 셀프 넘버 -> 생성자가 없는 숫자
    // 양의 정수 n이 존재할 때, d(n)을 n의 각 자릿수 숫자들과 n 자신을 더하는 함수라고 정의
    // n을 d(n)의 생성자라고한다
    // ex) 1, 3, 5, 7, 9, 20, 31 은 셀프넘버
    // ex) d(17) = 17 + 1 + 7 = 25

    public static void main(String[] args) {

        // 1 ~ 10000 사이의 숫자
        boolean check[] = new boolean[10001];

        for(int n = 1; n < 10001; n++) {
            int dn = d(n);
            if(dn < 10001) { // 10000 이하의 숫자만
                check[dn] = true;
            }
        }

        for(int n = 1; n < 10001; n++) {
            // false 일때 출력
            if(!check[n]) {
                System.out.println(n);
            }
        }
    }

    public static int d(int n) {
        int dn = n;
        while(n != 0) {
            dn += (n % 10); // 1의 자리
            n /= 10; // 10 - 100 - 1000의 자리 까지 출력
        }
        return dn;
    }

}
