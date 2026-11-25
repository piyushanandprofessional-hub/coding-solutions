class Solution {
    void rearrange(int[] arr) {
        // code here
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                pos.add(arr[i]);
            }else{
                neg.add(arr[i]);
            }
        }
        int i=0,j=0,k=0;
        
        while(i<pos.size() && j<neg.size()){
            arr[k++] = pos.get(i++);
            arr[k++] = neg.get(j++);
            
        }
        while(i<pos.size()){
            arr[k++] = pos.get(i++);
        }
        while(j<neg.size()){
            arr[k++] = neg.get(j++);
        }
    }
}