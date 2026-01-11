class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        double sum =0;
        double maxAvg =Integer.MIN_VALUE;
        if(nums.length==1)
         return nums[0];
        for(int i=0;i<k;i++){
            sum +=nums[i];

        }
        double avg1 = sum/k;
        
    if(avg1>maxAvg)
    maxAvg= avg1;
        
        for(int r=k;r<nums.length;r++){
         sum +=nums[r]-nums[r-k];
         double avg = sum/k;
         if(avg>maxAvg)
         maxAvg = avg;

        }
        return maxAvg;
    }
}
