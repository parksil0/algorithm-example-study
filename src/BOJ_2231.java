import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int input = Integer.parseInt(br.readLine());


        System.out.println(2%10);


    }
    //블로그 펌 https://st-lab.tistory.com/98
    static void other(String str_N) {
        // 해당 문자열의 길이 변수
        int N_len = str_N.length();

        // 문자열을 정수(int)로 변환
        int N = Integer.parseInt(str_N);
        int result = 0;


        // i 는 가능한 최솟값인 N - 9 * N의 각 자릿수부터 시작
        for(int i = (N - (N_len * 9)); i < N; i++) {
            int number = i;
            int sum = 0;	// 각 자릿수 합 변수

            while(number != 0) {
                sum += number % 10;	// 각 자릿수 더하기
                number /= 10;
            }

            // i 값과 각 자릿수 누적합이 같을 경우 (생성자를 찾았을 경우)
            if(sum + i == N) {
                result = i;
                break;
            }

        }

        System.out.println(result);
    }

    //내가 작성한 코드
    static void me(int input) {
        for(int i = 0; i < input; i++) {
            int length = Integer.toString(i).split("").length;
            int standard = (int)Math.pow(10, length-1);
            ArrayList<Integer> list = new ArrayList<>();
            int test = i;
            while(standard != 0) {
                list.add(test/standard);
                test = test - ((test/standard) * standard);
                standard /= 10;
            }
            int result = 0;
            for(int j = 0; j < list.size(); j++) {
                result += list.get(j);
            }
            if(i + result == input) {
                list.forEach(s -> {
                    System.out.print(s);
                });
                break;
            }
            if(i == input -1) {
                System.out.println(0);
                return;
            }
        }
    }
}
