package binarysearch;

public class P4_FirstBadVersion {

    private static boolean isBadVersion(int n){
        return n >= 4;
    }

    public static int exec(int n){
        int start = 1;
        int end = n;
        int result = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(isBadVersion(mid)){
                result = mid;
                end = mid -1;
            }else{
                start = mid +1;
            }
        }
        return result;
    }
}
