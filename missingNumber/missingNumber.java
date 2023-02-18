public int missingNumber(int[] nums) {
    //Without using extra time complexity
    int result= (nums.length*(nums.length+1))/2;
    int sum=0;
    for(int i:nums){
        sum +=i;
    }
    return result-sum; 

}