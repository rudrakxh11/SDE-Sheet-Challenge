class Solution {
    public int maxProfit(int[] prices) {
        int B_price=Integer.MAX_VALUE;
        int max_profit=0;
        for(int i=0;i<prices.length;i++){
            if(B_price<prices[i]){
                int prft=prices[i]-B_price;
                max_profit=Math.max(max_profit, prft);
            }else{
                B_price=prices[i];
            }
        }
        return max_profit;
    }
}