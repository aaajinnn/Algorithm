class Solution {
    public String solution(String s) {
        String[] answer = s.split(" ");
        
        int max = Integer.parseInt(answer[0]);
        int min = Integer.parseInt(answer[0]);
        
        for(int i=1; i<answer.length; i++){
            int num = Integer.parseInt(answer[i]);
            if(num<min){
                min = num;
            }
            if(num>max){
                max = num;
            }
        }
        return min + " " + max;
    }
}