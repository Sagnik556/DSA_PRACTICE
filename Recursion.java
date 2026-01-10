public class Recursion{
    public static void printNumbers(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
            printNumbers(n-1);
        
    }

    public static int naturalSum(int n){
        if(n==1){
            return 1;
        }
        int sum=n+naturalSum(n-1);
        return sum;
    }
    public static void main(String args[]){
        int n=5;
        System.out.println(naturalSum(n));
    }
} 