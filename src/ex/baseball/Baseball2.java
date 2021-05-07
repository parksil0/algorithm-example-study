package ex.baseball;

import java.util.Scanner;

public class Baseball2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] numArr = getNumbers();

        while( !checkDuplication(numArr) ) {
            numArr = getNumbers();
        }

        String[] inputArr;
        int strike = 0;
        int ball = 0;

        while(strike != 3) {

            System.out.print("\n숫자를 입력하세요: ");
            inputArr = sc.nextLine().split("");

            while(inputArr.length != 3 || !checkDuplication(inputArr)) {

                if(inputArr.length != 3) {
                    System.out.print("반드시 세자리로 입력해야합니다.\n숫자를 다시 입력해주세요: ");
                    inputArr = sc.nextLine().split("");
                } else {
                    if( !checkDuplication(inputArr) ) {
                        System.out.print("반드시 세자리 숫자는 모두 다른 숫자여야 합니다.\n숫자를 다시 입력해주세요: ");
                        inputArr = sc.nextLine().split("");
                    }
                }
            }

            System.out.print("입력한 숫자: ");
            for (String num : inputArr) {
                System.out.print(num);
            }

            for (int i = 0; i < 3; i++) {

                for (int j = 0; j < 3; j++) {

                    if (inputArr[i].equals(numArr[j])) {
                        if (i == j) {
                            strike++;
                        } else {
                            ball++;
                        }
                    }
                }
            }

            System.out.println();
            System.out.println(strike + " 스트라이크, " + ball + " 볼");

            if(strike != 3) {
                strike = 0;
                ball = 0;
            }
        }

        for(String num : numArr) {
            System.out.print(num);
        }

    }

    static String[] getNumbers() {
        String[] arr = Integer.toString( (int) (Math.random() * 1000 + 1)).split("");

        while(arr.length != 3) {
            arr = Integer.toString( (int) (Math.random() * 1000 + 1)).split("");
        }

        return arr;
    }

    static boolean checkDuplication(String[] arr) {
        boolean isAllDifference = false;

        if( !arr[0].equals(arr[1]) && !arr[1].equals(arr[2]) && !arr[0].equals(arr[2]) ) {
            isAllDifference = true;
        }

        return isAllDifference;
    }
}
