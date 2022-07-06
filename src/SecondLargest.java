public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        System.out.println(SecondLargestElement(arr));

    }

    public static int SecondLargestElement(int[] arr) {
        int res = -1;
        int a = 0 ;
        for (int i = 0; i <arr.length ; i++) {
         if(arr[i]>arr[a]){
             res=a;
             a=i;

         } else if (arr[i]!=arr[a]){
             if(res==-1||arr[i]>arr[res]){
                 res=i;
             }
         }

        }
        return arr[res];
    }

}
