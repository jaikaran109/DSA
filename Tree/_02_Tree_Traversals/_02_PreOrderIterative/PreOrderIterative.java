package DSA.Tree._02_Tree_Traversals._02_PreOrderIterative;
import java.util.*;

public class PreOrderIterative {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public List<Integer> preorderTraversal(TreeNode root) {

            List<Integer> ll=new ArrayList<>();
            Stack<TreeNode> st=new Stack<>();
            if(root==null){
                return ll;
            }
            st.push(root);
            while(!st.isEmpty()){

                TreeNode rv=st.pop();
                ll.add(rv.val);

                if(rv.right!=null){
                    st.push(rv.right);
                }
                if(rv.left!=null){
                    st.push(rv.left);
                }
            }

            return ll;

        }
    }
}
