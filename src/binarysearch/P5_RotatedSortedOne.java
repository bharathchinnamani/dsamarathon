package binarysearch;

public class P5_RotatedSortedOne {

    public static int exec(int[] nums, int target){
        int start = 0;
        int end = nums.length -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[start] <= nums[end]){
                return doSearch(nums,target,start,end);
            }else if(nums[start] <= nums[mid]){
                if(target >= nums[start] && target <= nums[mid]){
                    return doSearch(nums,target,start,mid);
                }else{
                    start = mid +1;
                }
            }else if(nums[mid] <= nums[end]){
                if(target >= nums[mid] && target <= nums[end]){
                    return doSearch(nums,target,mid,end);
                }else{
                    end = mid -1;
                }
            }
        }
        return -1;
    }

    private static int doSearch(int[] nums,int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target)
                start = mid +1;
            else
                end = mid -1;
        }
        return -1;
    }
}
