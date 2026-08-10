class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int high = 1000000000; 
        int ans = high;

        while (l <= high) {
            int mid = l + (high - l) / 2;

            if (isValid(piles, mid, h)) {
                ans = mid;
                high = mid - 1; 
            } else {
                l = mid + 1;    
            }
        }
        return ans;
    }

    private boolean isValid(int[] piles, int k, int h) {
        long totalHours = 0; 
        for (int pile : piles) {
            totalHours += (pile + k - 1) / k; 
        }
        return totalHours <= h;
    }
}
