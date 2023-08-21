import java.util.*;

class Solution {
    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashMap<String,ArrayList<String>> map = new HashMap<>();
        HashMap<String,Integer> reportCnt = new HashMap<>();
        HashMap<String, Integer> mailCnt = new HashMap<>();
        for (int i = 0; i < id_list.length; i++) {
            map.put(id_list[i], new ArrayList<>());
            reportCnt.put(id_list[i], 0);
            mailCnt.put(id_list[i], 0);
        }
        for (int i = 0; i < report.length; i++) {
            String arr[] = report[i].split(" ");

            if (!map.get(arr[1]).contains(arr[0])) {
                map.get(arr[1]).add(arr[0]);
                reportCnt.replace(arr[1], reportCnt.get(arr[1]) + 1);
            }
        }
        for (Map.Entry<String, Integer>item : reportCnt.entrySet()) {
            if (item.getValue() >= k) {
                ArrayList<String> list = map.get(item.getKey());
                for (int i = 0; i < list.size(); i++) {
                    mailCnt.put(list.get(i), mailCnt.getOrDefault(list.get(i), 0) + 1);
                }
            }
        }
        for (int i = 0; i < id_list.length; i++) {
            answer[i] = mailCnt.get(id_list[i]);
        }
        return answer;
    }
}