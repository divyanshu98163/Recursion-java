public class Recursion11 {
    public static int friendPair(int n){
        if(n==1||n==2){
            return n;
        }
        return friendPair(n-1)+(n-1)*friendPair(n-2);
    }
    public static void main(String[] args) {

        System.out.println("Friends Pair "+friendPair(3));
    }
}
