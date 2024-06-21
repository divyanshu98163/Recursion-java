public class Recursion2 {
    public static void printInc(int n){
        if(n==1){
            System.err.print(n+" ");
            return;
        }
        printInc(n-1);
        System.err.print(n+" ");
    }
    public static void main(String arg[]){
        int n = 10;
        printInc(n);
    }
}
