import java.util.Arrays;

public class Merge {
//    You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
//
//    Merge nums1 and nums2 into a single array sorted in non-decreasing order.
//
//    The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

    public static void main(String[] args) {

    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m==0||n==0){
            nums1=nums2;
        }
        for (int i = 0; i < m+n; i++) {
            nums1[m+i]=nums2[i];
        }
        Arrays.stream(nums1).sorted();
    }
}
