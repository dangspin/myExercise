class Solution {
    public int numJewelsInStones(String J, String S) {
        if (J.length() == 0) {
            return 0;
        }
        
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        for (char c: J.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, 0);
            }
        }
        
        for (char s: S.toCharArray()) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s)+1);
            } else {
                continue;
            }
        }
        
        int res = 0;
        for (char c: map.keySet()) {
            res = res + map.get(c);
        }
        
        return res;
    }
}
