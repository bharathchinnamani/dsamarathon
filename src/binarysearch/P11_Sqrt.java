package binarysearch;

public class P11_Sqrt {

    public static int exec(int x){
        // Corner Cases Handling
        if(x == 0) return 0;
        if(x == 1) return 1;
        // Actual Loop
        int start = 1;
        int end = x/2;
        int result = 0;
        while(start <= end){
            int mid = start + (end - start)/2;
            long power = (long)(mid) * mid;
            if(power > x){
                end = mid -1;
            }else{
                result = Math.max(mid,result);
                start = mid + 1;
            }
        }
        return result;
    }
}
