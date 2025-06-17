class Solution {
    public int summ(int num){
        int sum=0;
        
        while(num>0){
            
            int rem=num%10;
            sum+=rem;
            num=num/10;

        }
        return sum;

    }
    public int addDigits(int num) {
    int res=0;
    while(num>9){
        num = summ(num);
    }
    return num;
    }
}