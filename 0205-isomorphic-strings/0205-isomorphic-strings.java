class Solution {
    public boolean isIsomorphic(String s, String t) {
    int[] IndexS = new int[200];  
    int[] IndexT = new int[200];    
    if (s.length()!=t.length()) return false;
    for(int i =0;i<s.length();i++){
        if(IndexS[s.charAt(i)]!=IndexT[t.charAt(i)]){
            return false;
        }
        IndexS[s.charAt(i)] = i+1;
        IndexT[t.charAt(i)] = i+1;
    }
    return true;
    }
}