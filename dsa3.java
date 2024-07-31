class dsa3{
    public static int[] rightRotation(int[] arr){
        int n = arr.length;
        int temp = arr[n-1];
        for(int i = n-1; i>=1; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        return  arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int result[] = rightRotation(arr);
        for(int x:result){
            System.err.print(x + " ");
        }
    }
}


/*

You are given a array of numbers. Your task is to rotate the given array right(clockwise) by 1 units from the starting index. 
You are required to return the rotated array.

Input format
First line contains an integer n, the size of the array. Second line contains n integers, the elements of the array.

Output format
Return the rotated string.

Sample Input 1
1 2 3 4 5

Sample Output 1
5 1 2 3 4


*/