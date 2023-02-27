public int maxProfit(int[] prices) {
       int maxP = 0;
        int minPrice = Integer.MAX_VALUE;
        
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                int profit = price - minPrice;
                maxP = Math.max(maxP, profit);
            }
        }
        if(maxP<=0){
            return 0;
        }else{
            return maxP;
        }
        
    }