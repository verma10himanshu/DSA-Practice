public int maxProfit(int[] prices) {
    int max_profit=0;
    for(int i=0; i<prices.length-1;i++){
        for(int j=i+1; j<prices.length;j++){
            int max=prices[j]-prices[i];
            max_profit=Math.max(max,max_profit);
        }
    }
    if(max_profit<=0){
        return 0;
    }else{
        return max_profit;
    }