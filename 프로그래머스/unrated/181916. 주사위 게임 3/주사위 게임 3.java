import java.util.*;

class Solution {
    public static int solution(int a, int b, int c, int d) {
            int answer = 0;
            HashMap <Integer, Integer> map = new HashMap<>();
            map.put(a, map.getOrDefault(a, 0) + 1);
            map.put(b, map.getOrDefault(b, 0) + 1);
            map.put(c, map.getOrDefault(c, 0) + 1);
            map.put(d, map.getOrDefault(d, 0) + 1);

            ArrayList <Integer> temp = new ArrayList<>();
            int calVal = 0;
            if (map.size() == 1) { //모든 눈이 다 같음
                answer = a * 1111;
            } else if (map.size() == 2){
                for(Map.Entry<Integer,Integer> item : map.entrySet()) {
                    if (item.getValue() == 1 || item.getValue() == 3) {
                        if (item.getValue() == 3) {
                            temp.add(0,item.getKey());
                        } else {
                            temp.add(item.getKey());

                        }
                        calVal = 1;
                    } else if (item.getValue() == 2) {
                        temp.add(item.getKey());
                        calVal = 2;
                    }
                }
            } else if (map.size() == 3) {
                for (Map.Entry<Integer, Integer> item : map.entrySet()) {
                    if (item.getValue() != 2) {
                        temp.add(item.getKey());
                        calVal = 3;
                    }
                }
            } else {
                calVal = 4;
                map.keySet().stream().forEach(x-> temp.add(x));
            }

            switch (calVal) {
                case 1:
                    answer = (int)(Math.pow(10*temp.get(0)+temp.get(1),2));
                    break;
                case 2:
                    answer = (temp.get(0)+temp.get(1)) * Math.abs(temp.get(0)-temp.get(1));
                    break;
                case 3:
                    answer = temp.get(0) * temp.get(1);
                    break;
                case 4:
                    Collections.sort(temp);
                    answer = temp.get(0);
                    break;
            }
            return answer;
        }
}