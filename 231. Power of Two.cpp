// class Solution {
// public:
//     bool isPowerOfTwo(int n) {
//     for(int i=0;i<31;i++)
//     {
//         if(pow(2,i)==n)
//             return true;
//     }
//     return false;
//     }
// };
// updated
// class Solution {
// public:
//     bool isPowerOfTwo(int n) {

//         if(n<=0)
//             return false;
//         int count=0;
//         while(n)
//         {
//             int bit=n&1;//get bit
//             if(bit)//check one and count++
//                 count++;
//             n=n>>1;
//         }
//         return (count==1);
//     }
// };

class Solution {
public:
    bool isPowerOfTwo(int n) {
        return (n>0?(!(n&(n-1))):false);
    }
};