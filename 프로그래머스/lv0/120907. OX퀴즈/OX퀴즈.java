class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int i = 0; i < quiz.length; i++) {
            String []temp = new String[5];
            int idx = 0;
            
            for (String item : quiz[i].split(" ")) {
                temp[idx++] = item;
            }
            int n1 = Integer.parseInt(temp[0]);
            char op = temp[1].charAt(0);
            int n2 = Integer.parseInt(temp[2]);
            
            if (op == '+') {
                if (n1+n2 == Integer.parseInt(temp[4])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } else {
                if (n1-n2 == Integer.parseInt(temp[4])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
            
        }
        return answer;
    }
}