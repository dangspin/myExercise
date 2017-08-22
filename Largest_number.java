public String largestNumber(int[] nums) {
        // write your code here
        String[] str=new String[nums.length];
        for (int i=0;i<nums.length;i++){
            str[i]=Integer.toString(nums[i]);
        }
        
        Arrays.sort(str,new cmp());
        
        if (str[str.length-1].charAt(0)=='0'){
            return "0";
        }else{
            String res="";
            for (int i=nums.length-1;i>=0;i--){
                res=res+str[i];
            }
            
            return res;
        }
    }
    
    class cmp implements Comparator<String>{
        public int compare(String s1, String s2){
            
            int ls1=s1.length();
            int ls2=s2.length();
            
            int i=0;
            while (i<Math.min(ls1,ls2)){
                if (s1.charAt(i)!=s2.charAt(i)){
                    return s1.charAt(i)-s2.charAt(i);
                }else{
                    i=i+1;
                }
            }
            
            if (ls1==ls2 ){
                return 0;
            }else{
                return (s1+s2).compareTo(s2+s1);
            }
        }
    }
    
// This problem is not very special, but when the first time I tried to solve it, I made a mistake. The comparator I used here is to do 
// the lexicographical sort. but for this problem, the question is different, the counter example is like this: 2,28, the biggest number is
// 282, but for 9,96, the biggest number is 996, not 969. So the trikc is we need to consider (s1+s2) and (s2+s1).
