class Solution {
    public String processStr(String s) {
    StringBuilder sb = new StringBuilder();
    for(int i=0;i<s.length();i++){
        if(Character.isLetter(s.charAt(i))){
            sb.append(s.charAt(i));
        }
        if(s.charAt(i)=='#'){
            sb.append(sb.toString()); 

        }
        if(s.charAt(i)=='%') sb.reverse();

        if(s.charAt(i)=='*'&&sb.length()>0) sb.deleteCharAt(sb.length()-1); 
    }
    return sb.toString();
    }
}