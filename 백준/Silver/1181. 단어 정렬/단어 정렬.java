import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		String[] word = new String[num];
		
		scanner.nextLine();
		for(int i=0;i<num;i++) {
			word[i] = scanner.nextLine();
		}
		Arrays.sort(word, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() == o2.length()) {
					//단어 길이가 같으면 사전 순
					return o1.compareTo(o2);
				}
				else return o1.length() - o2.length();
			}
		});
		System.out.println(word[0]);
		for(int i=1; i< num; i++) {
			if(!word[i].equals(word[i-1])) {
				System.out.println(word[i]);
			}
		}
		scanner.close();
	}
}
