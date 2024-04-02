class Solution {
    public boolean isPalindrome(String s) {
            
        //TwoPointerApproach: use twopointer and some string and character methods| TC:(?)| SC:(?)
        boolean palinString=true;
        
        int l=0;
        int r=s.length()-1;
        while(l<r)
        {
            Character lvalue= s.charAt(l);
            Character rvalue= s.charAt(r);

            if(!Character.isLetterOrDigit(lvalue))
            {
                l++;
                continue;
            }
            if(!Character.isLetterOrDigit(rvalue))
            {
                r--;
                continue;
            }
            if(Character.toLowerCase(lvalue)!=Character.toLowerCase(rvalue))
                palinString=false;
            l++;
            r--;
        }
        return palinString;
    }
}