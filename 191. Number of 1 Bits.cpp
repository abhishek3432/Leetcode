class Solution {
public:
    int hammingWeight(uint32_t n) {
        
        short count=0;
        //work for any lenth
        while(n)
        {
            if(n&1)
                count++;
            n=n>>1;            

        }
        
        return count;
    }
    
    
};
