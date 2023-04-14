import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		boolean smallc=true;
		boolean largec=true;
		
		List <Character>stack = new ArrayList<>(); //Collection프레임워크의 List를 사용해서 stack생성
		
		while(true) {
			stack.clear();
			int ch = 0;
			String str = br.readLine(); //문자열 입력

			if(str.charAt(0)=='.' && str.length() ==1) break; //첫 글자 .이면 반복 종료
			
			for(int i=0;i<str.length();i++) {
				char current = str.charAt(i);

				if(current =='(' || current=='[') { //문자가 열린 괄호이면
					stack.add(current); //스택에 입력
				}
				else if(current ==')' || current==']') { //문자가 닫힌 괄호이면
				
					if(stack.size() != 0) { //스택이 비어있지 않을 때
						for(int j=stack.size()-1;j>=0;j--) { //스택의 맨 위부터 탐색
							if(current ==']' ) {
								if(stack.get(j)=='[') {
									stack.remove(j);
									break;
								}
								else{
									ch = 1;
									break;
								}
							}
							else if(current ==')' ) {
								if(stack.get(j)=='(') {
									stack.remove(j);
									break;
								}
								else {
									ch = 1;
									break;
								}
							}
						}
					}
					else {
						ch=1;
						break;
					}
				}
			}
			if(ch==0 && stack.size()==0) {
				sb.append("yes"+"\n");
			}
			else {
				sb.append("no"+"\n");
			}

		}
		System.out.print(sb);
	}
}