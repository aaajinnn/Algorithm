class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];

        while(s.length()>1){
            int cntOne = 0;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)=='0'){ // 0 제거 카운트
                    answer[1]++;
                }else{
                    cntOne++; // 1 카운트
                }
            }
            s = Integer.toBinaryString(cntOne); // 1의 갯수 이진수 변환
            answer[0]++;
        }
        
        return answer;
    }
}