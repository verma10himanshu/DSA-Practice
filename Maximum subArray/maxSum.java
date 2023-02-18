package Maximum subArray;

public public int maxSubArray(int[] nums) {
    //Brute force approch
    int Maxsum=Integer.MIN_VALUE;
    for(int i=0; i<nums.length; i++){
        int sum=0;
        for(int j=i;j<nums.length; j++){
            sum += nums[j];
            Maxsum=Math.max(sum, Maxsum);
        }
    }
    return Maxsum;
    
}
