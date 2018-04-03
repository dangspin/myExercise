class Solution {
    public String customSortString(String S, String T) {
        if (S.length() ==0 || T.length() == 0 ) {return T;}
        
        int[] bucket = new int[26];
        for (int i = 0; i < T.length(); i++) {
            bucket[T.charAt(i)-'a']++;
        }
        
        
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            while (bucket[S.charAt(i)-'a'] > 0) {
                res.append(S.charAt(i));
                bucket[S.charAt(i)-'a']--;
            }
        }
        
        for (int j = 0 ; j < T.length(); j++) {
            while (bucket[T.charAt(j)-'a'] > 0) {
                res.append(T.charAt(j));
                bucket[T.charAt(j)-'a']--;
            }
        }
        
        return res.toString();
    }
}
