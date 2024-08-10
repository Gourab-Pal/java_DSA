import java.util.*;

class twoSumUnsorted {
    public static void main(String[] args) {
        int[] arr = {4, 5, 8, 2, 9};
        System.out.println(checkTwoSum(arr, 70));
    }

    static boolean checkTwoSum(int[] a, int X) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i<a.length; i++) {
            int complementary = X - a[i];
            if (set.contains(complementary)) {
                return true;
            }
            else {
                set.add(a[i]);
            }
        }
        return false;
    }
}