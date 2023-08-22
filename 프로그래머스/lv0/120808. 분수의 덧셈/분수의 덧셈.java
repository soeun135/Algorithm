class Solution {
    public static int GCF(int a, int b) { //분모
        int r = a % b;
        if ( r == 0) {
            return b;
        } else {
            return GCF(b , r);
        }
    }
    public static int LCF(int a, int b) {
        return a * b / GCF(a, b);
    }
    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int newDenom = LCF(denom1, denom2);
        System.out.println(newDenom);
        if (denom1 != newDenom) {
            int t = newDenom / denom1;
            numer1 = numer1 * t;
        }
        if (denom2 != newDenom) {
            int t = newDenom / denom2;
            numer2 = numer2 * t;
        }
        
        int temp = GCF(numer1 + numer2, newDenom);
        answer[0] = (numer1 + numer2) /temp ;
        answer[1] = newDenom / temp;
        return answer;
    }
}