public int aplusb(int a, int b) {
        // write your code here, try to do it without arithmetic operators.
        while (b!=0){
        // This line is used to do sum. XOR is 0+1=1,1+0=1,0+0=0,1+1=0
            int sum=a^b;
            
        // This line is used to finish the carry, since 1+1=0 with extra bit 1, so <<1 need to do in order to add to new number
            int carry=(a&b)<<1;
            
        // this line is used to finish calculating and when there is no more carry, stop the loop, which indicates there is no more number to add
            a=sum;
            b=carry;
        }
        
        return a;
    }
