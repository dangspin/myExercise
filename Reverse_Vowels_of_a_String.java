class Solution {
    public String reverseVowels(String s) {
        char[] vowel = {'a','e','i','o','u', 'A','E','I','O','U'};
        
        char[] schar = s.toCharArray();
        
        int st = 0;
        int end = schar.length-1;
        
        while (st <= end) {
            if (!isIn(vowel, schar[st])) {st++;}
            else if (!isIn(vowel, schar[end])) {end--;}
            else {
            char tmp = schar[st];
            schar[st] = schar[end];
            schar[end] = tmp;
            st++;
            end--;
            }
        }
        
        return new String(schar);
    }
    
    public boolean isIn(char[] vowel, char target) {
        for (char c: vowel) {
            if (c == target) {
                return true;
            }
        } 
        
        return false;
    }
}
