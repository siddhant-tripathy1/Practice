import static java.lang.Math.max;
import static java.lang.Math.min;

public class waterstorage {
    public static int waterStorage(int arr[],int n ){
             int res=0;
        for (int i = 1; i <n-1 ; i++) {
             int lmax=arr[i];
            for (int j = 0; j < i; j++) {
                 lmax= max(lmax,arr[j]);
            }int rmax=arr[i];
            for (int j=i+1; j<n; j++){
            rmax=max(rmax,arr[j]);
            } res = res +(min(lmax,rmax)-arr[i]);
        } return res;

    }
}
