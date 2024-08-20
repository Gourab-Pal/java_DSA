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
        for (int j = 1; j<n; j++) {
            a[j] = a[j] + a[j-1];
        }
        return a;
    }
}