package inflearn.DFS;

public class Dfs1 {
    Node root;
    public int Dfs(int L, Node root) {
        if (root.lt==null && root.rt==null) return L;
        else return Math.min(Dfs(L+1, root.lt),Dfs(L+1, root.rt));
    }
    public static void main(String[] args) {
        Dfs1 tree = new Dfs1();
        tree.root=new Node(1);
        tree.root.lt=new Node(2);
        tree.root.rt=new Node(3);
        tree.root.lt.lt=new Node(4);
        tree.root.lt.rt=new Node(5);
        System.out.println(tree.Dfs(0,tree.root));
    }
}
