import java.util.*;
public class Recursion4 {
    public static int NaturalNum(int n){
        if(n==0){
            
            return 0;
        }
        int fn = n + NaturalNum(n-1);
        
        return fn;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.err.println(NaturalNum(n));

    }
}
