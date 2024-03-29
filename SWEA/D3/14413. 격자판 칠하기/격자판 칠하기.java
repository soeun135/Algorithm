import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {
	static int D[][] = {{-1,0},{1,0},{0,1},{0,-1}};
	static int N;
	static int M;
    public static void main(String[] args) throws IOException {
        
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int T = Integer.parseInt(br.readLine());
    	
    	for(int i=1;i<=T;i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		N = Integer.parseInt(st.nextToken());
    		M = Integer.parseInt(st.nextToken());

    		char arr[][] = new char[N][M];
    		for(int j=0;j<N;j++) {//값들 저장
    			String str = br.readLine();
    			
    			for(int k=0;k<str.length();k++) {
    				arr[j][k] = str.charAt(k);
    			}
    		}
    		int ch = BFS(arr,N,M);
    		if(ch == 0) System.out.println("#"+i+" "+"possible");
    		else System.out.println("#"+i+" "+"impossible");
    	}//하나의 테스트케이스 끝
    }
    public static int BFS(char arr[][],int N,int M) {
    	boolean visited[][] = new boolean[N][M];
    	int ch = 0;
    	Queue <Point> q = new LinkedList<>();
    	for(int i=0;i<N;i++) {
    		for(int j=0;j<M;j++) {
    			if(arr[i][j] != '?')
    				q.add(new Point(i,j));
    		}	
    	}
    	while(!q.isEmpty()) {
    		Point curr = q.remove();
    		
    		for(int i=0;i<4;i++) {
    			int nr = curr.row + D[i][0];
    			int nc = curr.col + D[i][1];
    			
    			if(nr <0 || nr>N-1 || nc<0 ||nc >M-1) continue;
    			if(visited[nr][nc]) continue;
    			if(arr[nr][nc]=='?') {
    				if(arr[curr.row][curr.col]=='#') {
    					arr[nr][nc] = '.';
    					q.add(new Point(nr,nc));
    					continue;
    				}
    				else {
    					arr[nr][nc] = '#';
    					q.add(new Point(nr,nc));
    					continue;
    				}
    			}
    			if(arr[nr][nc]!='?') {
    				if(arr[curr.row][curr.col] == arr[nr][nc]) {
    					ch = 1;
    					break;
    				}
    			}
    			visited[nr][nc] = true;
    			q.add(new Point(nr,nc));
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

