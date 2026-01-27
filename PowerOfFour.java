class Solution {
    public boolean isPowerOfFour(float n) {
        if(n==1.0)
          return true;
          if(n<=0 || n%4!=0)
          return false;
        return isPowerOfFour(n/4);
    }
}
