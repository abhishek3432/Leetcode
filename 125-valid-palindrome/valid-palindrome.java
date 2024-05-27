//125. Valid Palindrome
class Solution {
    public boolean isPalindrome(String s) {
        //Approach: use TwoPointer and some string and character methods
        //TC:(n)| SC:(1)
        boolean palinString=true;
        int l=0;//left pointer
        int r=s.length()-1;//right pointer
        while(l<r)//check left not crossed right or vice versa
        {
            Character lvalue= s.charAt(l);//get value at left pointer
            Character rvalue= s.charAt(r);//get value at right pointer

            if(!Character.isLetterOrDigit(lvalue))//check character is letter or digit
            {//if not shift left pointer 
                l++;
                continue;
            }
            if(!Character.isLetterOrDigit(rvalue))//check character is letter or digit
            {//if not shift right pointer
                r--;
                continue;
            }
            if(Character.toLowerCase(lvalue)!=Character.toLowerCase(rvalue))//get to 
            //lowercase and check character are equal or not
                return false;
            //shift to pointer to check other character of string
            l++;
            r--;
        }
        return palinString;
    }
    
    
}