import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        BigInteger num = new BigInteger(String.valueOf(1));
        for (int i = balls - share + 1; i <= balls; i++) {
            num = num.multiply(BigInteger.valueOf(i));
        }
        for (int i = 1; i <= share; i++) {
            num = num.divide(BigInteger.valueOf(i));
        }
        return num.intValue();
    }
}