class Solution {
    public int findDuplicate1(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            int x = Math.abs(nums[i]);
            if(nums[x] < 0) {
                return x;
            }

            nums[x] = -nums[x];
        }

        return -1;
    }

    //Slow and Fast pointers
    public int findDuplicate2(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (nums[slow] != nums[fast]);

        slow = nums[0];
        while(slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}