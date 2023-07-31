class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        for (String str : control.split("")){
         switch(str){
             case "w":
                n++;
                break;
            case "s" :
                n--;
                break;
            case "d" :
                n+=10;
                break;
             case "a":
                n-=10;
                break;
        }   
        }
        return n;
    }
}