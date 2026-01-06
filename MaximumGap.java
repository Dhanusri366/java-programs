import java.util.Arrays;
import java.lang.Math;
class MaximumGap {
    public int maximumGap(int[] nums) {
        int n = nums.length;
        if(n<2)
        return 0;
        int max_dis=0;
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++){
            int dis = nums[i+1]-nums[i];
            max_dis = Math.max(max_dis,dis);
         
        }
        return max_dis;
    }
}
