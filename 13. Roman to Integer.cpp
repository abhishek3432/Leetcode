class Solution {
public:
    int romanToInt(string s) {
        unordered_map <char,int> rtoi 
        {
            {'I',1},
            {'V',5},
            {'X',10},
            {'L',50},
            {'C',100},
            {'D',500},
            {'M',1000},           
        };

        int sum=0;

        for(int i=0; i<s.length(); i++)
        {
            if(rtoi[s[i]]<rtoi[s[i+1]])
            {
                sum-= rtoi[s[i]];
            }

            else
            {
                sum+=rtoi[s[i]];
            }

           // cout<<"sum : "<<sum<<endl;
        }
    return sum;
    }

};
