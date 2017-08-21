public class Solution {
    /*
     * @param numbers : An array of Integer
     * @param target : target = numbers[index1] + numbers[index2]
     * @return : [index1 + 1, index2 + 1] (index1 < index2)
     */
    public int[] twoSum(int[] numbers, int target) {
        // write your code here
        
        HashMap<Integer, Integer> help=new HashMap<Integer,Integer>();
        for (int i=0;i<numbers.length;i++){
            if (help.containsKey(target-numbers[i])==true){
                int[] res={help.get(target-numbers[i]),i+1};
                return res;
            }else{
                help.put(numbers[i],i+1);
            }
        }
        
        int[] res={};
        return res;
    }
}


// Second method:

public class Solution {
    /*
     * @param numbers : An array of Integer
     * @param target : target = numbers[index1] + numbers[index2]
     * @return : [index1 + 1, index2 + 1] (index1 < index2)
     */
    public int[] twoSum(int[] numbers, int target) {
        // write your code here
        arrayItem[] array=new arrayItem[numbers.length];
        
        int[] res=new int[2];
        
        for (int i=0;i<numbers.length;i++){
            array[i]=new arrayItem(numbers[i],i+1);
        }
        
        Arrays.sort(array,new compareItem());
        
        
        int i=0;int j=numbers.length-1;
        
        while (i<j){
            int candidate=array[i].val+array[j].val;
            
            if (candidate==target){
                int posi1=array[i].ind;
                int posi2=array[j].ind;
                
                if (posi1<posi2){
                    res[0]=posi1;
                    res[1]=posi2;
                }else{
                    res[0]=posi2;
                    res[1]=posi1;
                }
                return res;
            }
            
            else if (candidate<target){
                i++;
            }else{
                j--;
            }
        }
        
        return res;
    }
    
    class arrayItem{
        int val;
        int ind;
        
        public arrayItem(int val,int ind){
            this.val=val;
            this.ind=ind;
        }
    }
    
    class compareItem implements Comparator<arrayItem>{
        public int compare(arrayItem a1, arrayItem a2){
            return a1.val-a2.val;
        }
    }
}
