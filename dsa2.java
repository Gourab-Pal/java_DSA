class dsa2{
    public static int[] KfoldLeftRotate(int[] arr, int K){
        int n = arr.length;
        for(int k=0; k<K; k++){
            int temp = arr[0];
            for(int j=0; j<n-1; j++){
                arr[j] = arr[j+1];
            }
            arr[n-1] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int K = 2;
        int[] result = KfoldLeftRotate(arr, K);
        for(int x:result){
            System.out.print(x + " ");
        }
    }
}

/*
TC : O(K) x O(n-1) ~ O(K(n-1)) ~ O(nK)
SC: O(1)
*/

/*

You are given a array of numbers. Your task is to rotate the given array left(anti-clockwise) by K units from the starting index. 
You are required to return the rotated array.

Input format
First line contains an integer n, the size of the array. Second line contains n integers, the elements of the array.

Output format
Return the rotated string.

Sample Input 1 for K=2
1 2 3 4 5

Sample Output 1
3 4 5 1 2


*/