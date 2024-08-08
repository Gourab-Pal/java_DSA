public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,4,8,10,14};
        int result = searchTarget(arr, 2);
        System.out.println(result);
    }

    public static int searchTarget(int[] a, int target) {
        int b = 0;
        int e = a.length - 1;
        while (b<=e) {
            int m = (b+e)/2;
            if (a[m] == target) { 
                return m;
            }
            else if (a[m]<target) {
                b = m + 1;
            }
            else {
                e = m - 1;
            }
        }
        return  -1;
    }
    
}