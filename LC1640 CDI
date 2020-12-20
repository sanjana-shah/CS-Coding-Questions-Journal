class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++)
        {
            sb.append(arr[i]);
            sb.append("#");
        }
        
        for(int i=0;i<pieces.length;i++)
        {
            StringBuilder res=new StringBuilder();
            for(int j=0;j<pieces[i].length;j++)
            {
                res.append(String.valueOf(pieces[i][j]));
                res.append("#");
            }
            
            if(!sb.toString().contains(res.toString()))
            {
                return false;
            }
        }
        
        
        return true;
    }
}
