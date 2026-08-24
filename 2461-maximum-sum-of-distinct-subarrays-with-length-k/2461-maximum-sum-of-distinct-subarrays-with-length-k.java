class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long maxSum = 0;
        long currentSum = 0;
        int[] count = new int[100001];
        int duplicateCount = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            currentSum += nums[right];
            if (count[nums[right]] > 0) {
                duplicateCount++;
            }
            count[nums[right]]++;

            if (right - left + 1 > k) {
                count[nums[left]]--;
                if (count[nums[left]] > 0) {
                    duplicateCount--;
                }
                currentSum -= nums[left];
                left++;
            }

            if (right - left + 1 == k && duplicateCount == 0) {
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        return maxSum;
    }
}
