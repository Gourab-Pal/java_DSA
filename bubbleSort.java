

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 8, 2, 4, 1};
        int[] result = bubbleSort(arr);
        for (int i = 0; i<arr.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    static void swap(int[] a, int index) {
        int temp = a[index];
        a[index] = a[index + 1];
        a[index + 1] = temp;
    }

    static int[] bubbleSort(int[] a) {
        int n = a.length;
        int arraySize = n;
        while (arraySize>0) {
            for (int i = 0; i<arraySize-1; i++) {
                if (a[i] > a[i+1]) {
                    swap(a, i);
                }
            }
            arraySize = arraySize - 1;
        }
        return a;
    } 
}