class dsa1{
    public static int[] leftRotation(int[] arr){
        int temp = arr[0];
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = temp;
        return arr;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int[] result = leftRotation(arr);
        for(int x:result){
            System.err.print(x + " ");
        }
    }
}

/*
TC: O(n)
SC: O(1)
*/

/*

You are given a array of numbers. Your task is to rotate the given array left(anti-clockwise) by 1 units from the starting index. 
You are required to return the rotated array.

Input format
First line contains an integer n, the size of the array. Second line contains n integers, the elements of the array.

Output format
Return the rotated string.

Sample Input 1
1 2 3 4 5

Sample Output 1
2 3 4 5 1


*/