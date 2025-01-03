class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0){
            return 1;
        }
    int count=1;
    int unique=9;
    int digits=9;
    for(int i=1;i<=n && digits>0;i++){
        count+=unique;
        unique*=digits;
        digits--;
    }
    return count;
    }
}