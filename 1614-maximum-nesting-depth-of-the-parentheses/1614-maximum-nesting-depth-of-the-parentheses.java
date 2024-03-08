class Solution {
    public int maxDepth(String s) {
        int cur_max=0;
        int max=0;
        int n=s.length();
        
        for(int i=0; i<n; i++)
        {
            if(s.charAt(i)=='(')
            {
                cur_max++;
                
                if(cur_max>max)
                    max=cur_max;
            }
            
            else if(s.charAt(i)==')')
            {
                if(cur_max>0)
                    cur_max--;
                else 
                    return -1;
            }
        }
        
        if(cur_max!=0)
            return -1;
        
        return max;
    }
}