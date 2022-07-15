public class whoHasTHEMajority {
    public int majorityWins(int arr[], int n, int x, int y) {
        int counter = 0;
        int counter_1 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                counter++;
            }
            if (arr[i] == y) {
                counter_1++;
            }

        }
        if (counter > counter_1) {
            return x;
        } else {
            return y;
        }
        if(counter==counter_1){
            minimunoftwo(x,y);
        }
    };
    public int minimunoftwo
        ( int x, int y){
        if(x<y){
            return x;
        } else{
            return y ;
        }
    }
}


