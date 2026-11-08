package binarysearch;

public class P6_RotatedSortedOneMin {

    public static int exec(int[] nums){
        int start = 0;
        int end= nums.length -1;
        int result = nums[0];
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[start] <= nums[end]){
                return Math.min(result,nums[start]);
            }else if(nums[start] <= nums[mid]){
                result = Math.min(result, nums[start]);
                start = mid +1;
            }else if(nums[mid] <= nums[end]){
                result = Math.min(result,nums[mid]);
                end = mid -1;
            }
        }
        return result;
    }
}
