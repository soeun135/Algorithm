class Solution {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder(Integer.toString(n, 3)).reverse();
        return Integer.parseInt(sb.toString(), 3);
    }
}