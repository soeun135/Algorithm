class Solution {
    public int solution(int[] num_list) {
        int mulTotal = 1;
        int powTotal = 0;
        for (int i : num_list) {
            mulTotal *= i;
            powTotal += i;
        }
        powTotal = (int)Math.pow(powTotal,2);
        return mulTotal < powTotal ? 1 : 0;
    }
}