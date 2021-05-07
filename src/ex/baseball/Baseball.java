package ex.baseball;

import java.util.Scanner;

public class Baseball {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] randomNumArr = Integer.toString((int)(Math.random() * 1000 + 1)).split("");

        boolean isAllDifference = false;

        while(randomNumArr.length != 3 || !isAllDifference) {
            randomNumArr = Integer.toString((int)(Math.random() * 1000 + 1)).split("");

            if(randomNumArr.length == 3) {
                if( !randomNumArr[0].equals(randomNumArr[1]) && !randomNumArr[1].equals(randomNumArr[2]) && !randomNumArr[0].equals(randomNumArr[2]) ) {
                    isAllDifference = true;
                }
            }
        }

        System.out.print("랜덤 숫자 세자리: ");
        for(String num : randomNumArr) {
            System.out.print(num);
        }

        //사용자 입력 부분

        int strike = 0;
        int ball = 0;

        String[] inputNum;

        while(strike != 3) {

            System.out.print("\n숫자를 입력하세요: ");
            inputNum = sc.nextLine().split("");

            isAllDifference = false;
            while (inputNum.length != 3 || !isAllDifference) {

                if (inputNum.length != 3) {
                    System.out.print("반드시 세자리로 입력해야합니다.\n숫자를 다시 입력해주세요: ");
                    inputNum = sc.nextLine().split("");
                }

                if (inputNum.length == 3) {
                    if (!inputNum[0].equals(inputNum[1]) && !inputNum[1].equals(inputNum[2]) && !inputNum[0].equals(inputNum[2])) {
                        isAllDifference = true;
                    } else {
                        System.out.print("반드시 세자리 숫자는 모두 다른 숫자여야 합니다.\n숫자를 다시 입력해주세요: ");
                        inputNum = sc.nextLine().split("");
                    }
                }
            }

            System.out.print("입력한 숫자: ");
            for (String num : inputNum) {
                System.out.print(num);
            }

            for (int i = 0; i < 3; i++) {

                for (int j = 0; j < 3; j++) {

                    if (randomNumArr[i].equals(inputNum[j])) {
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

        System.out.println("정답!");
    }

    private boolean checkDuplication(String[] arr) {
        boolean isDuplication = false;

        if (!arr[0].equals(arr[1]) && !arr[1].equals(arr[2]) && !arr[0].equals(arr[2])) {
            isDuplication = true;
        }

        return isDuplication;
    }
}
