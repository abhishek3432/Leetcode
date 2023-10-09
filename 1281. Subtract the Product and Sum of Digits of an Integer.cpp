class Solution {
public:
    int subtractProductAndSum(int n) {
        int pr=1;
        int sum=0;
        //int temp=n;
        //int re;
        //int ans;
        while(n)
        {
            int re=n%10;
            pr=pr*re;
            sum=sum+re;
            n=n/10;
        }

        //ans=pr-sum;      
        
        return pr-sum;
    }
};
