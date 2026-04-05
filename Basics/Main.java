package Basics;

class pattern3 {
//    creating the function.
    public void pattern(int n){
        for (int i = 1; i <=n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

public class Main{
    public static void main(String[] args) {
        pattern3 p = new pattern3();
        int  n = 5;
        p.pattern(n);
    }
}
