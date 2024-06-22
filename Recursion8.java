public class Recursion8 {
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        return x*power(x, n-1);
    }

    public static int optmiePower(int x,int n){
        if(n==0){
            return 1;
        }
        int halfPow = optmiePower(x, n/2)*optmiePower(x, n/2);
        if(n%2!=0){
            halfPow =x*halfPow;
        }
        return halfPow;
    }
    public static void main(String[] args) {
        int x=2,n=10;
        System.err.println("X ka pow N :-"+power(x, n));
        System.err.println("X ka pow N O(logn) :-"+optmiePower(x, n));
        
    }
}
