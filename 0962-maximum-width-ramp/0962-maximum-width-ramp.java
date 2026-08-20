class Solution {
    public int maxWidthRamp(int[] nums) {
        int n = nums.length;
        int[] maxRight = new int[n];
        maxRight[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            maxRight[i] = Math.max(nums[i], maxRight[i + 1]);
        }
        
        int count = 0;
        int l = 0;
        int h = 0;
        
        while (h < n) {
            if (nums[l] <= maxRight[h]) {
                count = Math.max(count, h - l);
                h++; 
            } else {
                l++;
            }
        }
        
        return count;
    }
}
