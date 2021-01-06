import java.util.Scanner;

public class BOJ_1978 {
	public static void main(String[] args) {
		int nonPrime = 0;

		Scanner sc = new Scanner(System.in);
		int length = Integer.parseInt(sc.nextLine());

		String[] arr = sc.nextLine().split(" ");

		for(int i = 0; i < arr.length; i++) {

			if(Integer.parseInt(arr[i]) <= 1) {
				nonPrime++;
			} else {

				for (int j = 2; j < Integer.parseInt(arr[i]); j++) {
					if (Integer.parseInt(arr[i]) % j == 0) {
						nonPrime++;
						break;
					}
				}
			}
		}

		System.out.println(length - nonPrime);
	}

}
