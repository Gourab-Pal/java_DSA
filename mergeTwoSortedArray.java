class mergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {2, 5, 6};
        int[] result = mergeArray(arr1, arr2);
        for (int elem : result) {
            System.out.print(elem + " ");
        }
    }

    static int[] mergeArray(int[] a1, int[] a2) {
        int p1 = 0;
        int p2 = 0;
        int len1 = a1.length;
        int len2 = a2.length;
        int[] res = new int[len1+len2];
        int  i = 0;
        while (p1<len1 && p2<len2) {
            if (a1[p1]<a2[p2]) {
                res[i] = a1[p1];
                i++;
                p1++;
            }
            else {
                res[i] = a2[p2];
                i++;
                p2++;
            }
        }
        while (p1<len1) {
            res[i] = a1[p1];
            i++;
            p1++;
        }
        while (p2<len2) {
            res[i] = a2[p2];
            i++;
            p2++;
        }
        return res;
    }
}