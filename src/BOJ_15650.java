import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_15650 {
    public static int N;
    public static int M;
    public static int[] arr;
    public static boolean[] visit;
    public static Set set;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        visit = new boolean[N];

        set = new HashSet();

        dfs(0);
        ArrayList<String> list = new ArrayList<>(set);

        Collections.sort(list);
        list.forEach(System.out::println);

    }

    public static void dfs(int depth) {
        if (depth == M) {
            int[] arr2 = arr.clone();

            Arrays.sort(arr2);

            String str2 = "";
            for (int val : arr2) {
                str2 += val + " ";
            }
            set.add(str2);
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                arr[depth] = i + 1;
                dfs(depth + 1);
                visit[i] = false;
            }
        }
    }
}
