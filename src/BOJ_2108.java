import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BOJ_2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());

        int[] plus = new int[4001];
        int[] minus = new int[4001];
        int[] arr = new int[length];
        double sum = 0.0;

        for(int i = 0; i < length; i++) {
            int tmp = Integer.parseInt(br.readLine());
            arr[i] = tmp;
            if(tmp >= 0) {
                plus[tmp]++;
            } else {
                minus[Math.abs(tmp)]++;
            }
            sum += tmp;
        }

        br.close();

        ArrayList list = new ArrayList();
        int max = 1;
        for(int i = 0; i < 4001; i++) {
            if(minus[i] == max ) {
                list.add(-i);
            } else if(minus[i] > max) {
                max = minus[i];
                list.clear();
                list.add(-i);
            }
            if(plus[i] == max ) {
                list.add(i);
            } else if(plus[i] > max) {
                max = plus[i];
                list.clear();
                list.add(i);
            }
        }
        Collections.sort(list);
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();

        sb.append(Math.round(sum/length)).append('\n');
        sb.append(arr[length/2]).append('\n');
        if(list.size() > 1) {
            sb.append(list.get(1)).append('\n');
        } else {
            sb.append(list.get(0)).append('\n');
        }

        sb.append((arr[length-1] - arr[0])).append('\n');
        System.out.println(sb);
    }
}
