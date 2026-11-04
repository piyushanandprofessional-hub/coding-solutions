class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int el =nums[i];
            int req = target-el;

            if(map.containsKey(req)==true){
                int index1=map.get(req);
                int index2=i;
                return new int[]{index1, index2};
            }
            map.put(el,i);
        }
        return new int[]{};

        
    }
}