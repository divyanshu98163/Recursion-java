public class Recursion6 {
    public static boolean Sorted(int arr[],int i){
        
        if(i == arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return true;
        }
        return Sorted(arr,i+1);
    }
    public static void main(String arg[]){
        int arr[] ={1,2,3,4,};
        System.out.println(Sorted(arr,0));
    }
}
