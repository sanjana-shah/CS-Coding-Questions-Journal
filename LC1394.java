class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        int answer=-1;
        for(int i:arr)
            if(map.containsKey(i))
            {
                int k=map.get(i);
                map.put(i,++k);
            }
            else
                map.put(i,1);
        
        for(int i=arr.length-1;i>=0;i--)
            if(map.get(arr[i])==arr[i])
                answer=Math.max(answer,arr[i]);
        
        return answer;
    }
}
