class q1{
    public int[] twoSum(int[] nums, int target) {
        
        int n=nums.length;
        int[] result= new int[2];
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                    
                }
            }
        }
        return new int[0];
    }
}


// O(n²)
// tries every single combination