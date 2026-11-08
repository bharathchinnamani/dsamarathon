package binarysearch;

public class P7_RotatedSortedTwo {

    public static boolean exec(int[] nums, int target){
        int start = 0;
        int end = nums.length -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                return true;
            }else if(nums[start] == nums[mid]){
                start++;
            }else if(nums[mid] == nums[end]){
                end--;
            }else if(nums[start] < nums[end]){
                return doSearch(nums,target,start,end);
            }else if(nums[start] < nums[mid]){
                if(target >= nums[start] && target <= nums[mid]){
                    return doSearch(nums,target,start,mid);
                }else{
                    start = mid +1;
                }
            }else if(nums[mid] < nums[end]){
                if(target >= nums[mid] && target <= nums[end]){
                    return doSearch(nums,target,mid,end);
                }else{
                    end = mid -1;
                }
            }
        }
        return false;
    }

    public static boolean doSearch(int[] nums, int target,int start, int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target)
                return true;
            else if(nums[mid] < target)
                start = mid +1;
            else
                end = mid -1;
        }
        return false;
    }


}
