package 3sum;

public class 3sum {
    public List<List<Integer>> threeSum(int[] nums) {
        Set <List<Integer>> res  = new HashSet <> ();    //So that there shouldn't be any repeatation
   
   if(nums.length < 3) 
       return new ArrayList <> (res);  
   
   Arrays.sort(nums);
   
   for(int i=0; i<nums.length-2; i++){
       
       int j = i+1;
       int k = nums.length-1;
       
       while(j < k){
           
           int sum = nums[i] + nums[j] + nums[k];
           
           if(sum == 0)
               res.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
           
           else if (sum > 0) 
               k--;
           
           else if (sum < 0) 
               j++;
       }

   }
   
   return new ArrayList <> (res);
    
   }
    
}
