class Solution {
    public String solution(int[] food) {
        String answer = "";
        for(int i=1;i<food.length;i++){
            if(food[i] >= 2){
                int count = food[i]/2;
                for(int j=0;j<count;j++){
                    answer+=i;
                }
            }
        }
        answer += 0;
        for(int i=food.length-1;i>0;i--){
            if(food[i] >= 2){
                int count = food[i]/2;
                for(int j=0;j<count;j++){
                    answer+=i;
                }
            }
        }
        System.out.println(answer);
        return answer;
    }
}