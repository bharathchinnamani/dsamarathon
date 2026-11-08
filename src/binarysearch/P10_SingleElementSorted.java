package binarysearch;

public class P10_SingleElementSorted {

    public static int exec(int[] nums){
        if(nums.length == 1) return nums[0];
        int start = 0;
        int end = nums.length -1;
        int finalIndex = nums.length -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            // Left Portion of the Array
            // Even index is the start portion and odd index is the end
            // Right portion of the array
            // Odd index is the start and even index is the end
            if(mid % 2 == 0){
                if(mid+1 <= finalIndex && nums[mid] == nums[mid+1]){
                    start = mid +1; // Left Portion
                }else if(mid-1 >= 0 && nums[mid] == nums[mid-1]){
                    end = mid -1; // Right portion
                }else{
                    return nums[mid];
                }
            }
            else{
                if(mid+1 <= finalIndex && nums[mid] == nums[mid+1]){
                    end = mid-1; // Right Portion
                }else if(mid-1 >= 0 && nums[mid] == nums[mid-1]){
                    start = mid +1; // Left portion
                }else{
                    return nums[mid];
                }
            }
        }
        return -1;
    }
}
