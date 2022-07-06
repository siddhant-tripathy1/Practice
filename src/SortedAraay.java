public class SortedAraay {
    public static void main(String[] args) {
        int arr[] = {100,150,200,40};
        System.out.println(sorted(arr));
    }

    public static boolean sorted(int[] arr) {
        for (int i = 1; i <arr.length ; i++) {
           if(arr[i-1]<arr[i]){
               return false;
            }
        }
        return true;
    }
}


