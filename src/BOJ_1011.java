import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BOJ_1011 {
	public static void main(String[] args) {
		int cnt = 0;
		int cal = 1;

		Scanner sc = new Scanner(System.in);
		int length = Integer.parseInt(sc.nextLine());
		for(int i = 1; i <= length; i++) {

			String[] inputArr = sc.nextLine().split(" ");
			int num = Integer.parseInt(inputArr[1]) - Integer.parseInt(inputArr[0]);

			while(num > 0) {
				if(num - cal >= 0) {
					num -= cal;
				} else if (num > 0){
					cnt++;
					break;
				} else {
					break;
				}
				cnt++;
				if(num - cal >= 0) {
					num -= cal;
				} else if(num > 0){
					cnt++;
					break;
				} else {
					break;
				}
				cnt++;
				cal++;
			}
			System.out.println(cnt);
			cnt = 0;
			cal = 1;
		}
	}
}
