public class Hello {
    public static void main(String[] args){
       int[] element;
        element = new int[]{1,2,3,4,5,6};
    }
    static int LargestElement(int[] arr) {
        //to find the largest element in the array
        for (int i = 0; i < arr.length ; i++) {
            boolean flag = true;
            for (int j = 0; j <arr.length ; j++) {
                if(arr[j]>arr[i]){
                    flag =false;
                    break;
                }
                if(flag==true){
                    return -i;
                }
            }
        }
        return -1;
    }


}
