import java.util.ArrayList;

class dsa4{
    public static void main(String[] args) {
        int N = 4;
        String[] pattern = pyramidPrinting(N);
        for(String line:pattern){
            System.out.println(line);
        }
    }

    public static String[] pyramidPrinting(int N){
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i<N; i++){
            if(list.isEmpty()){
                list.add("*");
            } else{
                list.add(list.get(i-1) + "*");
            }
        }
        return list.toArray(new String[0]);
    }
}

/*

Problem Description
Given a number n, you have to print a triangle-shaped pattern with n rows using *. 
The starting row will have one * and will increment by one for each row after it 
( two *s in the second row, three *s in the third row, and so on till the nth row).

*/