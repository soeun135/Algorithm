import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int arr[] = new int [num];
		Stack <Integer>stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		int i=2;
		int j=0;
		int count =0;
		String str = " ";
		for(int k=0;k<num;k++) {
			arr[k] = Integer.parseInt(br.readLine());
		}
		stack.push(1);
		sb.append("+\n"); //일단 무조건 1은 들어가고 시작해야돼

			while(count != num) {
				//stack empty
				if(stack.empty()) {//스택이 비어있다면
					stack.push(i);
					sb.append("+\n");
					i++;
				}
				//stack을 만들 수가 없을 때
				if(stack.peek() >arr[j]) {
					str = "NO";
					break;
				}
				//push
				if(arr[j] != stack.peek() ) {//수열과 1부터 n까지 증가하는 수가 같지않으면
					stack.push(i); //다음수를 스택에 넣음
					sb.append("+\n");
					i++; //1부터 증가하는 
				}
				//pop
				else {//스택의 맨 위에 수와 수열의 수가 같으면
					if(!stack.empty()) {
						stack.pop(); //스택에서 pop
						sb.append("-\n");
						count++; //숫자가 몇 개나 pop돼서 나왔나(==수열과 일치하는 수를 몇 개 얻었는지)
						j++; //수열의 다음 수랑 비교해야되니까 인덱스값 1증가
					}
						
			}
		}
			if(str.equals("NO"))
				System.out.println(str);
			else
				System.out.print(sb);
	}
}