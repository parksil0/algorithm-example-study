import java.util.Scanner;

public class BOJ_2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String input =sc.nextLine();
        String[] nums = input.split(" ");
        
        int[] nums2 = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++) {
        	nums2[i] = Integer.parseInt((nums[i]));
        	
        }
        if(flip(nums2[0]) > flip(nums2[1])) {
        	System.out.println(flip(nums2[0]));
        } else {
        	System.out.println(flip(nums2[1]));
        }
    }
    
    public static int flip(int num){
        int result=0;
        while(num!=0){
            result= result * 10 + num % 10;
            num /= 10;
        }
        return result;
    }
}
