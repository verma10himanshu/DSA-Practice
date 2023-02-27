public int missingNumber(int[] nums) {
// using XOR method
  int n = nums.length;
    int missing = n;
    for (int i = 0; i < n; i++) {
        missing ^= i ^ nums[i];
    }
    return missing;
}