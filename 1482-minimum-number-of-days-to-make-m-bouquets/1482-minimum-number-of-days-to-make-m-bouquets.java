class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        return roseGarden(bloomDay, k, m);
    }

    static boolean isPossible(int[] bloomDay, int day, int m, int k){
        int cnt = 0;
        int bouquets = 0;

        for(int bloom : bloomDay){
            if(bloom <= day){
                cnt++;

                if(cnt == k){
                    bouquets++;
                    cnt = 0;
                }
            } else {
                cnt = 0;
            }
            
        }

        return bouquets >= m;
    }

    static int roseGarden(int[] bloomDay, int k, int m){
        long required = (long) m*k;

        if(required > bloomDay.length){
            return -1;
        }

        int minDay = Integer.MAX_VALUE;
        int maxDay = Integer.MIN_VALUE;

        for(int bloom : bloomDay){
            minDay = Math.min(minDay, bloom);
            maxDay = Math.max(maxDay, bloom);
        }

        int low = minDay, high = maxDay, result = -1;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(isPossible(bloomDay, mid, m, k)){
                result = mid;
                high = mid-1;
            } else { 
                low = mid+1;
            }
        }

        return result;
    }
}