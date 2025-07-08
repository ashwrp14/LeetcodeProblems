class Solution {
    public boolean isHappy(int n) {
      while(n>9){
        int sum=0;
        int t=n;
        while(t!=0){
            int last=t%10;
            sum+=last*last;
            t/=10;
        }
        n=sum;
      }
      return n==1||n==7;
    }
}
