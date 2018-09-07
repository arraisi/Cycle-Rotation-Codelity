// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        int arraySize = A.length;
        int[] newArray = new int[arraySize];
        int index = 0;
        for(int temp : A){
            newArray[(index+K)%arraySize] = temp;
            index++;
        }
        return newArray;
    }
}
