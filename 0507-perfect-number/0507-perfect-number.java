class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=1;
        if(num<=1){
            return false;
        }
     for(int i = 2;i*i<=num;i++){
        if(num%i==0){
            sum+=i;
            int div=num/i;
            if(div!=i){
                sum=sum+div;
            }
            
        }
        

     }   
     return sum==num;
    }
}