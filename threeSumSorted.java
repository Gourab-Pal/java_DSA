class threeSumSorted {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 8, 9};
        System.out.println(checkThreeSum(arr, 52));
    }

    static boolean checkThreeSum(int[] a, int X) {
        for (int i = 0; i<a.length-2; i++) {
            int p1 = i;
            int p2 = p1 + 1;
            int p3 = a.length-1;
            while (p2<p3) {
                int sum = a[p1] + a[p2] + a[p3];
                if (sum==X) {
                    return true;
                }
                else if (sum>X) {
                    p3--;
                }
                else {
                    p2++;
                }
            }
        }
        return false;
    }
}