class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> sigma = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            sigma.put(magazine.charAt(i), sigma.getOrDefault(magazine.charAt(i), 0) + 1);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            if (!sigma.containsKey(c) || sigma.get(c) == 0) {
                return false;
            }
            sigma.put(c, sigma.get(c) - 1);

        }
        return true;
    }
}