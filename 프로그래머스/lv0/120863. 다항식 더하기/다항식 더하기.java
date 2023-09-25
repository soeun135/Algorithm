import java.util.*;

class Solution {
    public String solution(String polynomial) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        String[] arr = polynomial.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        if(polynomial.length() == 1) {
            return polynomial;
        }
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].contains("x")) {
                int temp = 1;
                if(arr[i].length() == 1) {
                    temp = 1;
                } else {
                    temp = Integer.parseInt(arr[i].substring(0, arr[i].length()-1));            }
                map.put("x", map.getOrDefault("x", 0) + temp);
            } else if(!arr[i].equals("+")) {
                int temp = Integer.parseInt(arr[i]);
                map.put("0", map.getOrDefault("0", 0) + temp);
            }
        }
        if(map.keySet().contains("x")) {
            if (map.get("x") == 1) {
            sb.append("x");
        } else if(map.get("x") > 1){
            sb.append(map.get("x")).append("x");
        }
        if(map.get("x") != 0 && map.get("0") != null) {
            sb.append(" + ");
        }
        }
        
        if (map.get("0") != null) {
            sb.append(map.get("0"));
        }
        return sb.toString();
    }
}