class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;
        int sum = 0;
        int left = 0;
        int right = 1;
        while(right < n){

            if(prices[left ] < prices[right]){
                sum = prices[right]-prices[left];
                maxProfit = Math.max(maxProfit, sum);
                
            }else{
                left = right;
            }
            right++;
        }
        
        return maxProfit;
    }
}
