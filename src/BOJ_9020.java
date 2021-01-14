import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_9020 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static boolean isPrime = true;
    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws Throwable {

        int length = Integer.parseInt(br.readLine());

        for(int i = 1; i <= length; i++) {
            int num = Integer.parseInt(br.readLine());
            getPrime(num);
            getResult(num);
            list.clear();
        }
    }

    static void getResult(int num) {

        boolean isFinished = false;
        for(int i = list.size()-1; i >= 0; i--) {
            for(int j = i; j < list.size(); j++) {
                if(list.get(i) + list.get(j) == num) {
                    System.out.println(list.get(i) +" "+list.get(j));
                    isFinished=true;
                    break;
                }
            }
            if(isFinished){
                break;
            }
        }
    }

    static void getPrime(int num) {

        for(int j = 2; j <= num; j++) {
            if(j < 4) {
                list.add(j);
            } else {
                for(int k = 2; k <= Math.sqrt(j); k++) {
                    if(j % k == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime) {
                    list.add(j);
                }
                isPrime = true;
            }
        }
    }
}
