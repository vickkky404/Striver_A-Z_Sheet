package Basics;

class Solution{
    public void pattern5(int N){
        for(int i = 1; i <=N; i++){
            for(int j = N; j > i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

public class Pattern5 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int N = 5;
        sol.pattern5(N);
    }
}
