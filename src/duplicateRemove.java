public class duplicateRemove {
    public static void main(String[] args) {
        int arr[] = {2,3,10,6,4,8,1};
        System.out.println(sorted(arr));
    }
    public static int sorted(int[] arr) {
        int max = 0 ;
       int min = 0;
       int n=arr.length;
        for (int i = 0; i <n ; i++) {
            for (int j =i+1 ; j <n ; j++) {
                if(arr[j]>arr[i]){
                    max=j;
                }
                if(arr[j]<arr[i]){
                    min=j;
                }
            }
        }
        return (arr[max]-arr[min]);
    }

}
