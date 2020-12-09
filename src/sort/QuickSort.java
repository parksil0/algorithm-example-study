package sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {52, 16, 10, 2, 29, 14, 22};
        quickSort(array, 0, array.length-1);
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    static void quickSort(int[] array, int p, int r) {
        if(p < r) {
            int q = partition(array, p, r);
            quickSort(array, p, q-1);
            quickSort(array, q+1, r);
        }
    }

    static int partition(int[] array, int p, int r) {
        int x = array[r];
        int i = p - 1;
        int j = p;
        while(j < r) {
            if(array[j] <= x) {
                i++;
                swap(array, j, i);
            } else {
                j++;
            }
        }
        swap(array, r, i+1);
        return i + 1;
    }

    static int[] swap(int[] array, int num1, int num2) {
        int temp = array[num2];
        array[num2] = array[num1];
        array[num1] = temp;

        return array;
    }
}
