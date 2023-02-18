package nextperutaion;

public class permutation {
    public void nextPermutation(int[] nums) {
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) { // loop start from the end, find the first number num[i-1] less than num[i] 
                for (int j = nums.length - 1; j >= i; j--) { // loop from end, find the first number greater than num[i-1]
                    if (nums[i - 1] < nums[j]) {
                        swap(nums, i - 1, j); // swap them
                        Arrays.sort(nums, i, nums.length); // sort rest array in natural order
                        return;
                    }
                }
            }
        }
        Arrays.sort(nums); // handle case like [3,2,1]
    }
    public void swap(int []nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;

    }
    
}
