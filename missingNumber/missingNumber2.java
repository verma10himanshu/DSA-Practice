public int missingNumber(int[] nums) {
//Using extra time ccomplexity
       boolean[] present = new boolean[nums.length + 1];
    for (int i = 0; i < nums.length; i++) {
        present[nums[i]] = true;
    }
    for (int i = 0; i < present.length; i++) {
        if (!present[i]) {
            return i;
        }
    }
    return -1; // no missing number found 

}