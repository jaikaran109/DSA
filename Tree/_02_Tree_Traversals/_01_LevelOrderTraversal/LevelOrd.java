package DSA.Tree._02_Tree_Traversals._01_LevelOrderTraversal;
import java.util.*;
// BFS Traversal - Level Order Traversal

public class LevelOrd {
    static class TreeNode {
        int val;
        TreeNode left, right;

        // Constructor
        public TreeNode(int item) {
            val = item;
            left = right = null;
        }
    };
    public List<List<Integer>> levelOrder(TreeNode root,List<Double> list) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null)
            return result;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int count = q.size();
            List<Integer> level = new ArrayList<>();
            for(int i=0 ; i<count ; i++){
                TreeNode x = q.remove();
                level.add(x.val);
                if(x.left!=null)
                    q.add(x.left);
                if(x.right!=null)
                    q.add(x.right);
            }
            int sum = 0;
            for(int val : level){
                sum += val;
            }
            list.add(sum/level.size()*(1.0));
            result.add(level);
        }
        return result;
    }

    public static void main(String[] args) {


    }
}
