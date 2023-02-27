package Maximum subArray;

public class maxSum_1 {
    public int maxSubArray(int[] nums) {
    //Optimize approch
    int wantedSum= Integer.MIN_VALUE;
    int currentSum=0;
    for(int i=0; i<nums.length; i++){
            currentSum +=nums[i];
            if(currentSum>wantedSum){
                wantedSum=currentSum;
            }if(currentSum<0){
                currentSum=0;
            }
        }
        return wantedSum;
    }
    
}
