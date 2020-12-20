class Solution {
    public int findKthPositive(int[] arr, int k) {
        int i=1;
        int n=0;
        int answer=0;
        while(n!=k){
            boolean present=false;
            for(int j=0;j<arr.length;j++)
            {
                if(i==arr[j])
                {
                    present=true;
                    break;
                }
            }

            if(present==false)
            {
                n++;
                answer=i;
            }

            i++;              
        }
        
        return answer;
    }
}
