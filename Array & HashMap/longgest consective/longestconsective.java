package longgest consective;

public public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int longest = 1;
        int current = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) { // skip duplicate numbers
                continue;
            }
            if (nums[i] == nums[i-1] + 1) { // the current number extends the consecutive subsequence
                current++;
            } else { // the current number starts a new consecutive subsequence
                longest = Math.max(longest, current);
                current = 1;
            }
        }
        longest = Math.max(longest, current); // handle the last consecutive subsequence
        return longest;
    
}
