
class insertionSort {
    public static void main(String[] args) {
        int[] arr = {3, 8, 2, 4, 1};
        int result[] = insSort(arr);
        for (int i = 0; i<result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    static void swap(int[] a, int index) {
        int temp = a[index];
        a[index] = a[index + 1];
        a[index + 1] = temp;
    }

    static int[] insSort(int[] a) {
        int[] res = new int[a.length];
        int arraySize = 1;
        while (arraySize<=a.length) {
            res[arraySize-1] = a[arraySize-1];
            if (res.length>1) {
                for (int i = arraySize-1; i>0; i--) {
                    if (res[i]<res[i-1]) {
                        swap(res, i-1);
                    }
                }
            }
            arraySize = arraySize + 1;
        }
        return res;
    }
}