package binarysearch;

public class P8_RotatedSortedTwoMin {

    public static int exec(int[] nums){
        int result = nums[0];
        int start = 0;
        int end = nums.length -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[start] < nums[end]){
                result = Math.min(result,nums[start]);
                break;
            }else if(nums[start] == nums[mid]){
                result = Math.min(result,nums[start]);
                start++;
            }else if(nums[mid] == nums[end]){
                result = Math.min(result,nums[end]);
                end--;
            }else if(nums[start] < nums[mid]){
                result = Math.min(result,nums[start]);
                start = mid +1;
            }else if(nums[mid] < nums[end]){
                result = Math.min(result,nums[mid]);
                end = mid -1;
            }
        }
        return result;
    }
}
