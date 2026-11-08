package binarysearch;

public class P3_SearchInsertPosition {


    public static int exec(int[] nums, int target){
        int start = 0;
        int end = nums.length -1;
        int finalIndex = nums.length -1;
        while(start <= end){
            int mid = start + (end- start)/2;
            if(nums[mid] == target){
                return mid;
            }else if(mid == finalIndex && nums[mid] < target){
                return finalIndex +1;
            }else if(mid == 0 && nums[mid] > target){
                return 0;
            }else if(nums[mid] < target){
                if(mid+1 <= finalIndex && nums[mid+1] > target){
                    return mid+1;
                }else{
                    start = mid +1;
                }
            }else{
                if(mid-1 >= 0 && nums[mid-1] < target){
                    return mid;
                }else{
                    end = mid -1;
                }
            }
        }
        return -1;
    }
}
