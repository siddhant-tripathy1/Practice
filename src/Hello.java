public class Hello {
    public static void main(String[] args){
       int[] element;
        element = new int[]{1,2,3,4,5,6};
        System.out.println(LargestElement(element, 155));
    }
    static int LargestElement(int[] arr, int x) {
   int i  ;
        for ( i = 0; i < arr.length; i++) {
            if(arr[i] == x) {
                break;
            }
            if(i==arr.length){
                return (arr.length);

            }
        }
        for(int j = i; j<arr.length-1; j++){
            arr[j]=arr[j+1];

        }
        return (arr.length-1)
        ;
    }


}
