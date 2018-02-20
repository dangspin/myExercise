public class Solution {
    /**
     * @param str1: a given string
     * @param str2: another given string
     * @return: An array of missing string
     */
    public List<String> missingString(String str1, String str2) {
        // Write your code here
        List<String> res = new ArrayList<>();
        if (str1.length() > str2.length()) {
            String temp = str1;
            str1 = str2;
            str2 = temp;
        }
        
        String[] arr1 = str1.split(" ");
        String[] arr2 = str2.split(" ");
        Set<String> set = new HashSet<>();
        
        for (String str : arr1) {
            set.add(str);
        }
        
        for (String str : arr2) {
            if (!set.contains(str)) {
                res.add(str);
            }
        }
        
        return res;
    }
}
