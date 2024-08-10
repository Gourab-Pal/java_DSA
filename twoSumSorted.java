class twoSumSorted {
    public static void main(String[] args) {
        int[] arr = {2,4,5,8,9};
        System.out.println(findTwoSumSorted(arr, 7));
    }

    static boolean findTwoSumSorted(int[] a, int X) {
        int p1 = 0;
        int p2 = a.length - 1;
        while (p1<p2) {
            int sum = a[p1] + a[p2];
            if (sum==X) {
                return true;
            }
            else if (sum>X) {
                p2--;
            }
            else {
                p1++;
            }
        }
        return false;
    }
}