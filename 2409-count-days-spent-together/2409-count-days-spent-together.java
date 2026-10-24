class Solution {
    public int days(int num, int mum) {
        int arrmonth[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int val = 0;
        for (int i = 0; i < num; i++) {
            val += arrmonth[i];
        }
        return val + mum-1;
    }
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {

        // public int days(int num,int mum ){
        //     for(int i = 0; i < num; i++){
        //         val += arrmonth[i];
        //     }
        //     return val + mum;
        // }

        int aAmonth = (arriveAlice.charAt(0) - '0') * 10 + arriveAlice.charAt(1) - '0';
        int aAdate = (arriveAlice.charAt(3) - '0') * 10 + arriveAlice.charAt(4) - '0';
        int aBmonth = (arriveBob.charAt(0) - '0') * 10 + arriveBob.charAt(1) - '0';
        int aBdate = (arriveBob.charAt(3) - '0') * 10 + arriveBob.charAt(4) - '0';
        int lAmonth = (leaveAlice.charAt(0) - '0') * 10 + leaveAlice.charAt(1) - '0';
        int lAdate = (leaveAlice.charAt(3) - '0') * 10 + leaveAlice.charAt(4) - '0';
        int lBmonth = (leaveBob.charAt(0) - '0') * 10 + leaveBob.charAt(1) - '0';
        int lBdate = (leaveBob.charAt(3) - '0') * 10 + leaveBob.charAt(4) - '0';
        
        int arr1[] = new int[365];
        int arr2[] = new int[365];
        
        // arrmonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
        int val = 0;
        // public int days(int num,int mum ){
        //     for(int i = 0; i < num; i++){
        //         val += arrmonth[i];
        //     }
        //     return val + mum;
        // }

        int aa = days(aAmonth-1, aAdate);
        int la = days(lAmonth-1, lAdate); 
        int ab = days(aBmonth-1, aBdate);
        int lb = days(lBmonth-1, lBdate);
        
        for(int i = aa; i<=la; i++){
            arr1[i] = 1;
        }
        for(int i = ab; i<=lb; i++){
            arr2[i] = 1;
        }
        int count = 0;
        for(int i = 0; i<365; i++){
            if(arr1[i] == 1 && arr2[i] == 1){
                count++;
            }
        }
        return count;

        
        
    }
}