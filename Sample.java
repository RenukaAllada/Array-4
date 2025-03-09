class Sample{
    /************PROBLEM-1*****************/
    //TC:0(NLOGN)
//SC:0(1)
    class Solution {
        public int arrayPairSum(int[] nums) {
            if(nums==null || nums.length==0){
                return 0;
            }
            int total=0,n=nums.length;
            Arrays.sort(nums);
            for(int i=0;i<=n-2;i=i+2){
                int min=Math.min(nums[i],nums[i+1]);
                total+=min;
            }
            return total;
        }
    }

    
}