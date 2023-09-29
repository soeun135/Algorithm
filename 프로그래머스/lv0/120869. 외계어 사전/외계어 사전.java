class Solution {
    public int solution(String[] spell, String[] dic) {
        boolean flag = false;
        for(String s : dic) {
            int count = 0;
            
            for (String str : spell) {
                if (s.contains(str)) {
                    count ++;
                }
            }
            if (count == spell.length) {
                flag = true;
                break;
            }
        }
        return flag ? 1 : 2;
    }
}