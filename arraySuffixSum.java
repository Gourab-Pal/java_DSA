class arraySuffixSum {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 5, 15};
        int[] res = suffixSum(arr);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
    public static int[] suffixSum(int[] a) {
        int n = a.length;
        for (int j = n-2; j>=0; j--) {
            a[j] = a[j] + a[j+1];
        }
        return a;
    }
}