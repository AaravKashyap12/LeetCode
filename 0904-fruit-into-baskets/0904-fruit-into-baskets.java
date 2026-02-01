class Solution {
    public int totalFruit(int[] fruits) {
    int start = 0;
    int maxLen = Integer.MIN_VALUE;

    Map<Integer, Integer> map = new HashMap<>();

    for(int end = 0;end<fruits.length;end++){

        int fruit = fruits[end];
        int count = map.getOrDefault(fruit,0);

        map.put(fruit,count+1);

        while(map.size()>2){
            map.put(fruits[start],map.get(fruits[start])-1);

            if(map.get(fruits[start])==0){
                map.remove(fruits[start]);
            }
            start++;
        }

        maxLen = Math.max(maxLen,end-start+1) ;
        }
    return maxLen;
    }
}