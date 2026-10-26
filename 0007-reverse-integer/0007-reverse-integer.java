class Solution {
    public int reverse(int x) {
        int a = x;
        int ans = 0;
        int b = 0;
        

        while(a != 0){
            b = a%10;
            if(ans == 214748364 || ans == -214748364){
                if(ans < 0 && b > 7 || ans > 0 && b > 8){
                    return 0;
                }
                
            }
            else if(ans > 214748364 || ans < -214748364){
                return 0;
            }
            ans = (ans * 10) + b;
            a = a/10;

        }
        if(ans > 2147483647 || ans < -2147483648){
            return 0;
        }
        // if(x < 0){
        //     ans = ans - 2*ans;
        // }
        return ans;
    }
}



