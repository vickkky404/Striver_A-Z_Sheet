package Basics;

class Pattern7 {
    public void pattern7(int N) {
        
        for (int i = 0; i < N; i++) {

            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }

  
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }


            System.out.println();
        }
    }
}

public class Patter {
    public static void main(String[] args) {
        Pattern7 sol = new Pattern7();
        int N = 5;
        sol.pattern7(N);
    }
}
