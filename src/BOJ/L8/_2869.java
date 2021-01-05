package BOJ.L8;

import java.io.*;
import java.util.StringTokenizer;

public class _2869 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a  = Integer.parseInt(st.nextToken()); // 낮에 올라갈 수 있는 a미터
        int b  = Integer.parseInt(st.nextToken()); // 밤에 미끄러지는 b미터
        int v  = Integer.parseInt(st.nextToken()); // 올라갈 v미터

        // 하루에 오르는 값 = a - b
        // 올라갈 미터 v에서 -b(다시 내려가는 b) 해주면 최대 하루에 오르는 미터값
        // 따라서 하루에 오르는 값 (a - b)을 (v - b)에서 나눠준다면 day 값 알수있음
        // (v - b) / (a - b)

       int day = (v - b) / (a - b);

        if((v - b) % (a - b) != 0) { // 나머지가 존재하면 day+1
            day++;
        }
        System.out.println(day);
    }
}
