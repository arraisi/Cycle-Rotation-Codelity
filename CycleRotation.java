public class CycleRotation {
    public static void main(String[] args) {
        CycleRotation cycleRotation = new CycleRotation();
        int[] shop = {1,2,3,4};
        int i = 2;
        cycleRotation.solution(shop, i);
    }

    public static int[] solution(int[] A, int K) {

        return A;
    }
}

// UPDATE SOLUTION 7-September-2018
    // you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

// class Solution {
//     public int[] solution(int[] A, int K) {
//         // write your code in Java SE 8
//         int[] NewArray = new int[A.length];
//         int i = 0;
//         if (K%2 == 0) {
//             return A;
//         }
//         for (int temp : A){
//             if ((i+K) < A.length ) {
//                 NewArray[i+K] = temp;
//             } else {
//                 NewArray[i+1-K] = temp;    
//             }
//             i++;
//         }
//         return NewArray;
//     }
// }
