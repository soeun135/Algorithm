import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public ArrayList solution(int[] progresses, int[] speeds) {
            ArrayList list = new ArrayList();
            Queue<Integer> q1 = new LinkedList<>();
            Queue<Integer> q2 = new LinkedList<>();

            int cnt = 0;
            for (int i = 0; i < progresses.length; i++) {
                q1.add(progresses[i]);
                q2.add(speeds[i]);
            }
            while(!q1.isEmpty()){
                if(q1.peek() < 100){
                    if(cnt != 0){
                        list.add(cnt);
                    }
                    cnt = 0;
                    for (int i = 0; i < q1.size(); i++) {
                        int num = q1.poll();
                        int speed = q2.poll();
                        q1.add(num+speed);
                        q2.add(speed);
                    }
                }
                else{
                    cnt ++;
                    q1.poll();
                    q2.poll();
                }
            }
            if(cnt != 0) list.add(cnt);
            return list;
    }
}