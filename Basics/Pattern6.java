package Basics;

class Solution {
    public void pattern6(int N) {
        
        for (int i = 0; i < N; i++) {
            for (int j = N; j > i; j--) {
                System.out.print((N - j + 1) + " ");
            }
            
            System.out.println();
        }
    }
}

public class Pattern6 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int N = 5;

        sol.pattern6(N);
    }
}
