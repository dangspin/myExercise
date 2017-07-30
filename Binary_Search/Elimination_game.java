public class Solution {
//     public int lastRemaining(int n) {
//         return leftmax(n);
//     }
    
//     public int leftmax(int n){
//         if (n<=2){return n;}
//         return 2*rightmax(n/2);
//     }
    
//     public int rightmax(int n){
//         if (n<=2){return 1;}
//         else{
//             if (n%2==1){
//                 return 2*leftmax(n/2);
//             }else{
//                 return 2*leftmax(n/2)-1;
//             }
//         }
//     }
    
    public int lastRemaining(int n){
        return help(n,true);
    }
    
    public int help(int n, boolean isleft){
        if (n<=2){
            if (isleft){
                return n;
            }else{
                return 1;
            }
        }else{
            if (isleft){
                return 2*help(n/2,false);
            }else{
                if (n%2==1){
                    return 2*help(n/2,true);
                }else{
                    return 2*help(n/2,true)-1;
                }
            }
        }
        
    }
}
