class Solution {
    public int minFlips(String s) {
    int n = s.length();
    String doubled = s+s;
    int minflips = Integer.MAX_VALUE;

    int diff1 = 0;
    int diff2 = 0;

    for(int i =0;i<n*2;i++){

    char target1 = (i%2==0)?'0':'1';    
    char target2 = (i%2==0)?'1':'0';   

    if(doubled.charAt(i)!=target1) diff1++;
    if(doubled.charAt(i)!=target2) diff2++;

    if(i>=n){
        int leftIdx = i-n;
        char leftTarget1 = (leftIdx%2==0)?'0':'1';
        char leftTarget2 = (leftIdx%2==0)?'1':'0';

        if(doubled.charAt(leftIdx)!=leftTarget1) diff1--;
        if(doubled.charAt(leftIdx)!=leftTarget2) diff2--;
    }
    if(i>=n-1){
        minflips = Math.min(minflips,Math.min(diff1,diff2));
    }
    }
    return minflips;
    }
}