class Solution {
    public int solution(int n) {
        int answer = 0;
        int k=n/7;
        if(n%7==0){
           answer=k*1;
         }else if(n%7!=0){
           answer=k*1+1;
}
        return answer;
    }
}