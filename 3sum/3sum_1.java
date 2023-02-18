package 3sum;

public class 3sum_1 {
    List<List<Integer>>res=new ArrayList();
    public List<List<Integer>> threeSum(int[] nums) {
        List<Integer>list=new ArrayList<Integer>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(i==0 || nums[i-1]!=nums[i]){
                twoSumSorted(i+1,nums.length-1,nums,0-nums[i]);
            }
        }
            return res;
            
        }
        void twoSumSorted(int i, int j, int nums[], int target){
            int a1=nums[i-1];
            while(i<j){//search space
            if(nums[i]+nums[j]>target){
                j--;
            }else if(nums[i]+nums[j]<target){
                    i++;
            }else{
                List<Integer>list=new ArrayList();
                list.add(a1);
                list.add(nums[i]);
                list.add(nums[j]);
                res.add(list);
                //Handle dulpicate b
                while(i<j && nums[i]== nums[i+1])i++;
                //Hamdle duplicate c
                while(i<j && nums[j]==nums[j-1])j--;
                i++;
                j--;

            }
        }
    }
    
}
