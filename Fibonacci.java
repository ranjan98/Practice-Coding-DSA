import java.util.ArrayList;
import java.util.HashMap;
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
    // Using Dynamic Programming Approach
    public static int fibonacciDP(int n){
        int fibonacci[] = new int[n+2];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for(int i=2;i<=n;i++){
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }
        return fibonacci[n];
    }
    // Using Dynamic Programming Approach - Another Solution
    static HashMap<Integer, Integer> fibonacci = new HashMap<>();
    public static int fibDP(int n){
        if(fibonacci.get(n)!=null)
            return fibonacci.get(n);
        else{
            if(n < 2)
                return n;
            else{
                fibonacci.put(n, fibDP(n-1) + fibDP(n-2));
                return fibonacci.get(n);
            }
        }
    }
    public static void main(String args[]){
        int n = 8;
        // Fibonacci Series: [0, 1, 1, 2, 3, 5, 8, ...]
        int fibRecursive = fibonacciRecursive(n);
        System.out.println(fibRecursive);
        int fibIterative = fibonacciIterative(n);
        System.out.println(fibIterative);
        int fibDP = fibonacciDP(n);
        System.out.println(fibDP);
        int fibDP2 = fibDP(n);
        System.out.println(fibDP2);
    }
}
