package binarysearch;

public class P9_PeakIndex {

    public static int exec(int[] nums){
        int start = 0;
        int end = nums.length -1;
        int finalIndex = nums.length -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(mid +1 <= finalIndex && mid-1 >= 0 && nums[mid] > nums[mid+1] && nums[mid] > nums[mid-1]){
                return mid; // Case mid is the peak index
            }else if(mid+1 <= finalIndex && nums[mid] < nums[mid+1]){
                start = mid +1;// Case mid is in left side
            }else if(mid+1 <= finalIndex && nums[mid] > nums[mid+1]){
                end = mid -1; // Case mid is in right side
            }
        }
        return -1;
    }
}
