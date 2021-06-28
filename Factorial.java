public class Factorial{
    // Using Recursive Approach
    public static int factorialRecursive(int n){
        if(n <= 1){
            return n;
        }
        return n*factorialRecursive(n-1);
    }
    
    // Using Iterative Approach
    public static int factorialIterative(int n){
        for(int i=n; i>1;i--){
            n *= i-1;
        }
        return n;
    }
    public static void main(String args[]){
        int n = 5;
        int factRecursive = factorialRecursive(n);
        System.out.println("Factorial of " + n + " is: " + factRecursive);
        int factIterative = factorialIterative(n);
        System.out.println("Factorial of " + n + " is: " + factIterative);
    }
}
