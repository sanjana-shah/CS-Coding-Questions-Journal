class Solution {
    public int maximumWealth(int[][] accounts) {
        int result=0;
        
        for(int i=0;i<accounts.length;i++)
        {
            int sum=0;
            for(int j:accounts[i])
                sum+=j;
            
            result=Math.max(sum,result);
        }
        
        return result;
    }
}
