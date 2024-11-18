
import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

public class Main {
    static int N, M;
    static Set<String> set = new HashSet<>();
    static StringBuilder sb = new StringBuilder();
    static int[] num;
    static int[] selected;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        num = new int[N];
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(num);

        selected = new int[M];
        visited = new boolean[N];
        dfs(0, 0);

        System.out.println(sb);
    }

    public static void dfs(int start, int depth) {
        if (depth == M) {
            String result = Arrays.stream(selected)
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining(" "));
            if(!set.contains(result)) {
                set.add(result);
                sb.append(result).append("\n");
            }
            return;
        }
        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                selected[depth] = num[i];
                visited[i] = true;
                dfs(i + 1, depth + 1);
                visited[i] = false;
            }
        }
    }
}
