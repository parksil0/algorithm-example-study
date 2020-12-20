package sort;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        //A는 무작위의 수들이 있는 배열
        int[] array = {2, 5, 3, 0, 2, 3, 0, 3};

        //배열 C의 크기는 수의 최대 값을 담을 수 있게 선언
        //array의 최대값은 5이기 때문에 0 ~ 5를 모두 담을 수 있는 배열을 생성해야한다.
        int[] counting = new int[6];

        //정렬된 값이 넣어질 배열이다. 배열의 길이는 array의 배열의 길이와 같아야한다.
        int[] sorted_arr = new int[array.length];

        //각 인덱스에 해당하는 수 counting 시작
        for(int i = 0; i < array.length; i++) {
            counting[array[i]]++;
        }

        //counting 배열을 누적으로 덧셈 연산을 한다.
        for(int i = 1; i < counting.length; i++) {
            counting[i] += counting[i-1];
        }

        //맨 뒤에서 부터 0번 인덱스까지 새로운 배열에 해당 인덱스에 값을 넣는다.
        for(int i = array.length-1; i >= 0; i--) {
            counting[array[i]]--;
            sorted_arr[counting[array[i]]] = array[i];
        }

        Arrays.stream(sorted_arr).forEach(System.out::print);
    }
}
