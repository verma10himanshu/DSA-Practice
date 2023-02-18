public int[] twoSum(int[] nums, int target) {
    int arr[]=new int[2];
    for(int i=0; i<nums.length-1; i++){
        for(int j=i+1; j<nums.length; j++){
            if(nums[i]+nums[j]==target){
                arr[0]=i;
                arr[1]=j;
            }
        }
        
    }
    return arr;
}

//Time complexity- O(n)+O(n)----->O(n)
//Space complexity- In this code i am using array of length two so the space is O(2) which is constant 