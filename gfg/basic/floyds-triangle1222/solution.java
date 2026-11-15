class Solution {
    public void printFloydTriangle(int n) {
        // code here
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
            System.out.print(num+" ");
            num++;
        }
        System.out.println();
        }
    }
}