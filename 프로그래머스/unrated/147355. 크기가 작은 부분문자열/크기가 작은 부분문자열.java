class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int i = 0;
        int j = p.length();
        
        while(i+j-1 != t.length()){
            long t1 = Long.parseLong(t.substring(i,i+j));
            long p1 = Long.parseLong(p);
            if(t1 <= p1) answer ++;
            i++;
        }
        return answer;
    }
}