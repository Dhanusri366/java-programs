import java.util.HashMap.*;
import java.util.Map.*;
class FindDuplicatesInArrays {
    public boolean containsDuplicate(int[] nums) {
         Map<Integer, Integer> dict = new HashMap<>();
         int n = nums.length;
         for(int i=0;i<n;i++){
            if(dict.containsKey(nums[i]))
          return true;
         
         else{
            dict.put(nums[i],1);
         }
         }
         return false;
    }
}
