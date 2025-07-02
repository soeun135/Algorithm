import java.util.*;
import java.io.*;

class Main {
    static Map<Character, Node> map;
    static List<Node> list;
    
    public static class Node implements Comparable<Node>{
        char node;
        char left;
        char right;
        
        public Node(char node, char left, char right) {
            this.node = node;
            this.left = left;
            this.right = right;
        }
        
        @Override
        public int compareTo(Node o1) {
            return this.node - o1.node;
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        list = new ArrayList<>();
        map = new HashMap<>();
        
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            char a = st.nextToken().charAt(0);
            char b = st.nextToken().charAt(0);
            char c = st.nextToken().charAt(0);
            
            Node node = new Node(a, b, c);

            map.put(a, node);
           
        }
        Node root = map.get('A');
        
        preOrder(root);
        System.out.println();
        
        InOrder(root);
        System.out.println();
        
        postOrder(root);
    }
    
    public static void preOrder(Node cur) {
        if(cur == null) return;
        
        System.out.print(cur.node);
        
        preOrder(map.get(cur.left));
        preOrder(map.get(cur.right));
    }
    public static void InOrder(Node cur) {
        if(cur == null) return;
        
        InOrder(map.get(cur.left));
        System.out.print(cur.node);
        InOrder(map.get(cur.right));
    }
    public static void postOrder(Node cur) {
        if(cur == null) return;
        
        postOrder(map.get(cur.left));
        postOrder(map.get(cur.right));
        System.out.print(cur.node);
    }
}