class Solution {
    public void reverseInGroups(int[] arr, int k) {
        // code here
        
        int n=arr.length;
        for(int i =0;i<n;i+=k){
            int st=i;
            int end =Math.min(i+k-1,n-1);
            while(st<end){
                int temp = arr[st];
                arr[st] = arr[end];
                arr[end] =temp;
                st++;
                end--;
                
            }
        }
        
    }
}