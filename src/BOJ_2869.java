import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2869 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		
		int A = Integer.parseInt(input[0]);
		int B = Integer.parseInt(input[1]);
		int V = Integer.parseInt(input[2]);
		
		int num1 = V-B;
		int num2 = A-B;
		
		if(num1 % num2 == 0) {
			System.out.println(num1 / num2);
		} else {
			System.out.println((num1 / num2) + 1);
			
		}
		
	}
	/*
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		
		double A = Integer.parseInt(input[0]);
		double B = Integer.parseInt(input[1]);
		double V = Integer.parseInt(input[2]);
		
		double num1 = V-A;
		double num2 = A-B;
		
		double result =  Math.ceil(num1 / num2);
		
		System.out.println((int)(result+1));
	}
	*/
}
