import java.util.*;

class dsa5{
    public static ArrayList<Integer> extractNumbers(int N, ArrayList<String> arr){
        ArrayList<Integer> numList = new ArrayList<>();
        for(int i = 0; i<N; i++){
            try {
                int num = Integer.parseInt(arr.get(i));
                numList.add(num);
            } catch (Exception e) {
                continue;
            }
        }
        return  numList;
    }
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>(Arrays.asList("a", "3", "long", "17", "crio", "dsa", "100", "20"));
        ArrayList<Integer> ans = extractNumbers(8, arr);
        for(int x:ans){
            System.out.print(x + " ");
        }
    }
}

/*

Problem Description
Given an array containing a mix of strings and numbers, such as [a, 1, b, 2, c, d, 3, 4, e], 
your task is to create a new array that retains only the numbers present in the original array.

For example, from the provided array, the output array should contain [1, 2, 3, 4]. 
The numbers in the original array can be single or multiple digits, and there may be strings interspersed among them.

Note: The numbers in the array are also of string type.

Input format
First line contains an integer N, the number of elements in the input array

Second line contains the elements of the input array

Output format
Return the expected integer array. The order of integers in the input array must be maintained.

Sample Input 1
8

a 3 long 17 crio dsa 100 20

Sample Output 1
3 17 100 20

Explanation
The input array contains four integers [3, 17, 100, 20]

*/