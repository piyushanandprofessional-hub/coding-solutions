class Solution {
    public int searchInsert(int[] nums, int target) {
        int l =0;
        int r=nums.length-1;
        int pos =-1;

        if(nums[0]>target){
            return 0;
        }

            while(l<=r){
                int mid = l+(r-l)/2;

                if(nums[mid]==target){
                    return mid;
                }
                else if(nums[mid]<target){
                    pos =mid+1;
                    l=mid+1;
                }
                else{
                    r=mid-1;
                }
            }
        return pos;

        
    }
}