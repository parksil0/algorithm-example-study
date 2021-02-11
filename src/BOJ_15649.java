import java.util.*;
import java.io.*;

/**
 * 자료 참조 : https://st-lab.tistory.com/114
 */
public class BOJ_15649 {

    static int N;
    static int M;
    static int[] arr;
    static boolean[] isVisit;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        isVisit = new boolean[N];

        seq(0);
        System.out.println(sb);
    }

    static void seq(int depth) {
        if(depth == M) {
            for(int val : arr) {
                sb.append(val + " ");
            }
            sb.append('\n');
            return;
        }

        for(int i = 0; i < N; i++) {
            if(!isVisit[i]) {
                isVisit[i] = true;
                arr[depth] = i + 1;
                seq(depth + 1);
                isVisit[i] = false;
            }
        }
    }
}
