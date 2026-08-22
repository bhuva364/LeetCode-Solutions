import java.util.*;

class Solution {
    public int numberOfGoodPartitions(int[] nums) {
        Map<Integer, Integer> lastSeen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            lastSeen.put(nums[i], i);
        }

        int count = 0;
        int maxIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            maxIndex = Math.max(maxIndex, lastSeen.get(nums[i]));
            if (i == maxIndex) {
                count++;
            }
        }

        int MOD = 1_000_000_007;
        long ans = 1;
        for (int i = 0; i < count - 1; i++) {
            ans = (ans * 2) % MOD;
        }

        return (int) ans;
    }
}
