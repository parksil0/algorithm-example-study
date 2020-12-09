package sort;

public class MergeSort {
    public static void main(String[] args){
        int[] array = {5, 4, 7, 13, 2, 9, 15};
        mergeSort(array, 0, array.length-1);
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    static void mergeSort(int[] array, int p, int r) {
        if(p < r) {
            int q = (p + r)/2;
            mergeSort(array, p, q);
            mergeSort(array, q+1, r);
            merge(array, p, q, r);
        }
    }

    static void merge(int data[], int p, int q, int r) {
        int i = p, j = q + 1, k = p;
        int[] temp = new int[data.length];
        while( i <= q && j <= r ) {
            if(data[i] <= data[j]) {
                temp[k++] = data[i++];
            } else {
                temp[k++] = data[j++];
            }
        }
        while(i <= q) {
            temp[k++] = data[i++];
        }
        while(j <= r) {
            temp[k++] = data[j++];
        }
        for(int num = p; num <= r; num++) {
            data[num] = temp[num];
        }
    }


}