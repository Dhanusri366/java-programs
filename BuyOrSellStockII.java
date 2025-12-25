class BuyOrSellStockII {
    public int maximumProfit(int prices[]) {
      
      int   maxprofit =0;
     
        int n = prices.length;
        for(int i=1;i<n;i++){
            if(prices[i]>prices[i-1]){
                maxprofit = maxprofit+(prices[i]-prices[i-1]);
            }
            
        }
        return maxprofit;
    }
}
