import java.util.Arrays;

class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);

        int moves = 0;
        int median = (int)(nums.length/2);
        for(int i = 0; i < nums.length; i++) {
            moves += Math.abs(nums[median] - nums[i]);
        }

        return moves;
    }
}

// https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii/