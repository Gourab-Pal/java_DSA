class cumulativeSum{
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 5, 15};
        int[] res = calculateCumulativeSum(arr);
        for(int i : res) {
            System.out.print(i + " ");
        }
    }
    public static int[] calculateCumulativeSum(int[] a) {
        int sum = 0;
        int n = a.length;
        int[] r = new int[n];
        for (int j = 0; j<n; j++) {
            if (j==0) {
                sum = a[j];
                r[j] = sum;
            }
            else {
                sum = sum + a[j];
                r[j] = sum;
            }
        }
        return r;
    }
}