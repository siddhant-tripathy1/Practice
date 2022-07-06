public class largestNumber {
    public static void main(String[] args) {
        int arr[]  = {1,2,3,55,55,6};
        System.out.println(largestElemet(arr));
    }

    public static int largestElemet(int[] arr) {
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>arr[a]){
                a=i;
            }
        }
        return a;
    }
}
