public int[] twoSum(int[] nums, int target) {
        // Now we can optimized this by using hash map
        HashMap<Integer, Integer>map = new HashMap<>();
        int arr[] =new int[2];
        for(int i=0; i<nums.length; i++){
            int a= target-nums[i];
            if(map.containsKey(a)){
                arr[0]=i;
                arr[1]=map.get(a)

            }
            map.put(nums[i],i);
        }
        return arr;
    }

// Time complexity- In this i am using one for lopp so the TC is O(n)
//Spce complexity- In this i am using one hashmap for storing elements of array length n so in the worst case space would be o(n);