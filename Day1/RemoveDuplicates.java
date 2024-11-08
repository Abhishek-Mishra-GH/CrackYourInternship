class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int c = 1;
        int k = 1;
        while (i < nums.length) {

            while (k < nums.length) {
                if (nums[k] != nums[i]) {
                    nums[i + 1] = nums[k];
                    c++;
                    break;
                }

                k++;
            }

            i++;
        }

        return c;
    }
}