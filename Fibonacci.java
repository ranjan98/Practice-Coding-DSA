import java.util.ArrayList;
public class Fibonacci{
    // Using Recursive Approach
    public static int fibonacciRecursive(int n){
        if(n <= 1){
            return n;
        }
        return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
    }
    
    // Using Iterative Approach
    public static int fibonacciIterative(int n){
        ArrayList<Integer> fib = new ArrayList<>();
        fib.add(0);
        fib.add(1);
        for(int i=2; i<=n;i++){
            fib.add(fib.get(i-1) + fib.get(i-2));
        }
        return fib.get(n);
    }
    public static void main(String args[]){
        int n = 8;
        // Fibonacci Series: [0, 1, 1, 2, 3, 5, 8, ...]
        int fibRecursive = fibonacciRecursive(n);
        System.out.println(fibRecursive);
        int fibIterative = fibonacciIterative(n);
        System.out.println(fibIterative);
    }
}
