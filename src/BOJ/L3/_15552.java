package BOJ.L3;

import java.io.*;

public class _15552 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++){
            String n = br.readLine();
            String arr[] = n.split(" ");
            
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            bw.write((a + b) + "\n");
        }
        br.close();

        bw.flush();
        bw.close();

    }
}
