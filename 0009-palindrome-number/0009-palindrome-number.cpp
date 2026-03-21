class Solution {
public:
    bool isPalindrome(int x) {
        bool b;
        long long rev=0,rem;
        long long y=x;
      if (x<0) b=false;
      else {
        while(x>0){
            rem=x%10;
            rev=rev*10+rem;
            x=x/10;
        }
        if(rev==y){
            b=true;
        }
        else b=false;
      }
      return b;
    }
};