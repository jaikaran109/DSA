package DSA.Tree._05_Advanced_Problems._05_BinaryTreeColoring;
import java.util.*;
public class BinaryTreeColoring {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    private TreeNode root;
    public void buildTree(){
        root = bt(root);
    }
    Scanner sc = new Scanner(System.in);
    public TreeNode bt(TreeNode root){
        int data = sc.nextInt();
        TreeNode new_node = new TreeNode(data);

        Boolean bool = sc.nextBoolean();
        if(bool) new_node.left = bt(new_node);
        bool = sc.nextBoolean();
        if(bool) new_node.right = bt(new_node);

        return new_node;
    }
    public void btreeGameWinningMove(int n,int x){
        System.out.println(btreeGameWinningMove(root,n,x));
    }

    public boolean btreeGameWinningMove(TreeNode root, int n, int x) {

        find(root,x);

        int lc=count(p1.left);
        int rc=count(p1.right);


        return Math.max(lc,Math.max(rc,n-lc-rc-1))>n/2;


    }
    TreeNode p1=null;
    public void find(TreeNode node,int x){

        if(node==null||p1!=null)
            return;
        if(node.val==x)
            p1=node;
        find(node.left,x);
        find(node.right,x);
    }
    public int count(TreeNode node){

        if(node==null)
            return 0;

        return count(node.left)+count(node.right)+1;
    }

    public static void main(String[] args) {
        BinaryTreeColoring obj = new BinaryTreeColoring();
        obj.buildTree();
        obj.btreeGameWinningMove(11,3);
    }
}
