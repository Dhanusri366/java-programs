class BuyOrSellStock {
    public int maximumProfit(int prices[]) {
      
        int n = prices.length;
        int min = prices[0];
        
        int maxprofit=0;
        if(n==1)
         return 0;
        for(int i=0;i<n;i++){
            if(prices[i]<min){
            min = prices[i];
                
            }
            else{
            maxprofit = Math.max(maxprofit,prices[i]-min);
                
            }
        }
       
        return maxprofit;
    }
}
