class Solution {
    public boolean isPowerofTwo(int n) {
        // code here
        // if(n%2==0){
        //     return true;
            
        // }else{
        //     return false;
        // }
        if(n<=0){
                    return false;
                }
                return (n & (n-1))==0 ;
    }
}