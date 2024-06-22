public class Recursion7 {
    public static int FirstOccurence(int arr[],int key,int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return FirstOccurence(arr, key, i+1);
    }

    public static int LastOccurence(int arr[],int key,int i){
        if(i == arr.length){
            return -1;
        }
        int Found = LastOccurence(arr, key, i+1);
        if(Found == -1 && arr[i] == key){
            return i;
        }

        return Found;
    }    

    public static void main(String[] args) {
        int arr[] ={8,3,6,9,5,10,2,5,6};
        System.err.println(FirstOccurence(arr, 5, 0));
        System.err.println(LastOccurence(arr, 5, 0));
    }
}
