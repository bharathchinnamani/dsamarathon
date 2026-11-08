package binarysearch;

public class P2_FirstLastPosition {

    public static int[] exec(int[] nums, int target){
        return new int[]{getFirstPos(nums, target),getLastPos(nums,target)};
    }

    private static int getFirstPos(int[] nums, int target){
        int start = 0;
        int end = nums.length -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] > target){
                end = mid -1;
            }else{
                if(nums[mid] == target){
                    if(mid-1 >= 0 && nums[mid-1] != target){
                        return mid;
                    }
                    else if(mid == 0){
                        return mid;
                    }
                    else{
                        end = mid -1;
                    }
                }else{
                    start = mid +1;
                }
            }
        }
        return -1;
    }

    private static int getLastPos(int[] nums, int target){
        int start = 0;
        int finalIndex = nums.length -1;
        int end = nums.length -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] < target){
                start = mid +1;
            }else{
                if(nums[mid] == target){
                    if(mid+1 <= finalIndex &&  nums[mid+1] != target){
                        return mid;
                    }
                    else if(mid == finalIndex){
                        return mid;
                    }
                    else{
                        start = mid +1;
                    }
                }else{
                    end = mid -1;
                }
            }
        }
        return -1;
    }
}
