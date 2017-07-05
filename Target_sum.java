public class HelloWorld{

     public static void main(String []args){
        int[] in={5,2,1,4,1};
        int target=-3;
        int len=in.length-1;
        System.out.println(targetsum(in,len, target));
     }
     
     public static int targetsum(int[] array,int end, int tar){
         
         if (end<0){
             return 0;
         }
         if (end==0){
             if (array[0]==Math.abs(tar)){
                 return 1;
             }else{
                 return 0;
             }
         }
         
         return targetsum(array,end-1, tar-array[end])+targetsum(array,end-1, tar+array[end]);
     }
}
