package sort;

public class HeapSort {
    public static void main(String[] args) {
        int[] array = { 2, 5, 1, 6, 3, 7, 9, 22, 13 };

        heapSort(array);

        for (int v : array) {
            System.out.println(v);
        }
    }

    static void heapSort(int[] array) {
        for(int i = (array.length/2) -1; i >= 0; i--) {
            heapify(array, i);
        }

        for(int i = array.length-1; i > 0; i--) {
            swap(array, 0, 1);
            heapify(array, 0);
        }
    }

    static void heapify(int array[], int i) {
        int p = i;
        int l = i * 2 + 1;
        int r = i * 2 + 2;

        if(l < array.length && array[p] < array[l]) {
            p = l;
        }

        if(l < array.length && array[p] < array[r]) {
            p = r;
        }

        if(i != p) {
            swap(array, p, i);
            heapify(array, p);
        }
    }

    static void swap(int array[], int p, int i) {
        int temp = array[p];
        array[p] = array[i];
        array[i] = temp;
    }
}
