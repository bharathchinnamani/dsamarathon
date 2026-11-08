package binarysearch;

public class P12_Koko {

    public static int exec(int[] piles,int h){
        int start = 1;
        int end = getMax(piles); // Going beyond this speed is worthless
        int result = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            long time = getTime(piles,mid,h);
            // If the time required by koko is higher than the available time we have to increase the speed.
            if(time > h){
                start = mid +1;
            }else{ // else we have to decrease the speed.
                result = result == -1 ? mid : Math.min(mid,result);
                end = mid -1;
            }
        }
        return result;
    }

    private static long getTime(int[] piles, int speed, int h){
        long time = 0;
        for(int data : piles){
            time += (data + speed -1)/speed;
            if(time > h) break;
        }
        return time;
    }

    private static int getMax(int[] piles){
        int max = piles[0];
        for(int i=1;i<piles.length;i++)
            max = Math.max(max,piles[i]);
        return max;
    }

}
