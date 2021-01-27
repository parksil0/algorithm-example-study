import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * 출처 : https://st-lab.tistory.com/96
 *
 *
 * */
public class BOJ_11729 {

    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        sb.append((int) (Math.pow(2, N) - 1)).append('\n');

        Hanoi(N, 1, 2, 3);
        System.out.println(sb);

    }

	/*
		N : 원판의 개수
		start : 출발지
		by : 옮기기 위해 이동해야 장소
		to : 목적지
	 */

    public static void Hanoi(int N, int start, int by, int to) {
        // 이동할 원반의 수가 1개라면?
        if (N == 1) {
            sb.append(start + " " + to + "\n");
            return;
        }
        // STEP 1 : N-1개를 1에서 2로 이동
        Hanoi(N - 1, start, to, by);

        // STEP 2 : 1개를 1에서 3로 이동
        sb.append(start + " " + to + "\n");

        // STEP 3 : N-1개를 2에서 3로 이동
        Hanoi(N - 1, by, start, to);

    }
}
