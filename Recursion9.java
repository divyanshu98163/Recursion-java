public class Recursion9 {
    public static int tillingProb(int n){
        // base 
        if(n == 0 || n == 1){
            return 1;
        }
        //vertical 
        int fnm1 =tillingProb(n-1);

        //horizental
        int fnm2 =tillingProb(n-2);

        return fnm1+fnm2;
    }
    public static void main(String args[]){
        System.out.println(tillingProb(4));
    }
}
