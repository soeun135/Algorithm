class Solution {
    public int[] solution(String s) {

        StringBuilder sb = new StringBuilder();
        int zeroCnt = 0;
        int changeCnt = 0;

        while (true) {
            String deleteStr = s.replaceAll("0", "");

            int leftLength = deleteStr.length();

            zeroCnt += s.length() - leftLength;
            
            s = Integer.toString(leftLength, 2);
            changeCnt++;
            
            if (s.equals("1")) {
                break;
            }
        }
        
        return new int[] {changeCnt, zeroCnt};
    }
}