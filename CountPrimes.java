import java.util.*;
class Solution {
    public int countPrimes(int n) {
        if(n<2) 
        return 0;
  boolean[] list = new boolean[n];
  int count=0;
for(int i=2;i<n;i++){
    list[i]=true;
}
for(int i=2;i*i<n;i++){
    if(list[i]){
    for(int j=i*i;j<n;j+=i){
        list[j]=false;
    }}
}
for(int i=2;i<n;i++){
    if(list[i])
    count++;
}
return count;
    }
}
