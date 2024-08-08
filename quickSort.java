class quickSort {
    public static void main(String[] args) {
        int[] arr = {3, 8, 2, 1, 5, 4};
        int result[] = qSort(arr, 0, arr.length-1);
        for (int i = 0; i<result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    static void swap(int[] a, int idx1, int idx2) {
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }

    static int partition(int[] a, int b, int e) {
        int p = e;
        int l = b;
        int h = p-1;
        while (l<=h) {
            if (a[l] < a[p]) {
                l++;
            }
            else {
                swap(a, l, h);
                h--;
            }
        }
        swap(a, l, p);
        return l;
    }

    static int[] qSort(int[] a, int beg, int end) {
        int b = beg;
        int e = end;
        if (b<e) {
            int p = partition(a, b, e);
            qSort(a, b, p-1);
            qSort(a, p+1, end);
        }
        return a;
    }
}