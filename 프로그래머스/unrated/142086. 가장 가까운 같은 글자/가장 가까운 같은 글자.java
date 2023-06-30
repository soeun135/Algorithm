class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        //List <Integer> list = new ArrayList<>();
        int result = -1;
        for(int i=0;i<s.length();i++){
            result = -1;
            for(int j = 0;j<i;j++){
                if(s.charAt(i) == s.charAt(j)){
                    result = i-j;
                }
            }
            answer[i] = result;
        }
        return answer;
    }
}