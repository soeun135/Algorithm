import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {
	static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        
        for(int i=1;i<=T;i++) {
        	N = Integer.parseInt(br.readLine());
        	char arr[][] = new char[N][N];
        	
        	for(int j=0;j<N;j++) {
        		String str = br.readLine();
        		for(int k=0;k<N;k++) {
        			arr[j][k] = str.charAt(k);
        		}
        	}
        	int ch = BFS(arr,N);
        	if(ch ==1 )System.out.println("#"+i+" no");
        	else System.out.println("#"+i+" yes");
        }//하나의 테스트케이스 끝
  
    }
    public static int BFS(char arr[][],int N) {
    	boolean visited[][] = new boolean[N][N];
    	int ch = 0;
    	Queue <Point>q = new LinkedList<>();
    	
    	for(int i=0;i<N;i++) {
    		for(int j=0;j<N;j++) {
    			if(arr[i][j] == '#') {
    				q.add(new Point(i,j));
    				break;
    			}
    		}
    	}
    	int length = q.size();
    	int count = 1;
    	while(!q.isEmpty()) {
    		Point curr = q.remove();
    		count = 1;
    		int i=1;
    		while(true) {
    			int nc = curr.col+i;
    			
    			if(nc > N-1 || arr[curr.row][nc] =='.') break;
    			if(arr[curr.row][nc]=='#') {
    				count ++;
    			}
    			i++;
    		}
   			if(count != length) {
   				ch = 1; break;
   			}
    	}
      	return ch;
    }
    static class Point{
    	int row,col;
    	Point(int r,int c){
    		row = r; col = c;
    	}
    }
}

