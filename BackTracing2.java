public class BackTracing2 {

    public static void FindSubset(String str,String ans,int i){
        if(i==str.length()){
            System.err.println(ans+"");
            return;
        }
         // yescchoise 
        FindSubset(str, ans+str.charAt(i), i+1);

        // no choice
        FindSubset(str, ans, i+1);
    }

   

    public static void main(String args[]){

        String str = "abc";
        FindSubset(str, "", 0);

    }
}
