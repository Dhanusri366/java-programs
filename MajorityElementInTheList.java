import java.lang.Math;
import java.util.*;
class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        
        int n = arr.length;
        ArrayList<Integer> b = new ArrayList<>();
        
        int major = (int)Math.floor(n/3);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
               map.put(arr[i],map.get(arr[i])+1) ;
            }
            else{
            map.put(arr[i],1);
                
            }
             if(map.get(arr[i])>major){
        if(!b.contains(arr[i])){
           b.add(arr[i]);}
        }
        }
    Collections.sort(b);
     return b;
    }
}
