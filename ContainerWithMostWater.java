class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int l = 0;
        int n = height.length;
        int r = n-1;
        int maxw =0;
        while(l<r){
            int diff = r-l;
            if(height[l]<height[r]){
            maxw = Math.max(maxw, diff*height[l]);
            l++;
            }
            else{
                maxw = Math.max(maxw, diff*height[r]);
                r--;
            }
        }
        return maxw;
        
    }
}
