package DSA.Tree._01_Tree_Basics._02_AVLTree;

public class AVLTree {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    };
    private TreeNode root;

    public void Binary_Search_Tree(int[] in){

        root=CreateTree(in,0,in.length-1);

    }
    private TreeNode CreateTree(int[] in,int si, int ei){

        if(si>ei){
            return null;
        }
        TreeNode nn=new TreeNode();

        int mid=(si+ei)/2;
        nn.val=in[mid];

        nn.left=CreateTree(in, si, mid-1);
        nn.right=CreateTree(in, mid+1, ei);
        return nn;
    }
    public void insert(int val){
        root=insert(root, val);
    }

    private TreeNode insert(TreeNode root,int val){

        if(root==null){
            TreeNode nn=new TreeNode();
            nn.val=val;
            return nn;
        }
        if(root.val<val){
            root.right=insert(root.right, val);
        }
        if(root.val>val){
            root.left=insert(root.left, val);
        }

        return balance(root);
        // return root;
    }
    public int ht(){
        return ht(root);
    }
    private int ht(TreeNode root){
        if(root==null){
            return 0;
        }
        return Math.max(ht(root.left),ht(root.right))+1;
    }
    private TreeNode balance(TreeNode root){
        //left-left ||left-right
        if(ht(root.left)-ht(root.right)>1){
            //left-left
            if(ht(root.left.left)-ht(root.left.right)>0){
                return RightRotate(root);
            }
            //left-right
            if(ht(root.left.right)-ht(root.left.left)>0){
                root.left=LeftRotate(root.left);
                return  RightRotate(root);
            }
        }
        if(ht(root.right)-ht(root.left)>1){
            //right -right
            if(ht(root.right.right)-ht(root.right.left)>0){
                return LeftRotate(root);
            }
            //left-right
            if(ht(root.right.left)-ht(root.right.right)>0){
                root.right=RightRotate(root.right);
                return  LeftRotate(root);
            }

        }
        return root;
    }
    public TreeNode LeftRotate(TreeNode p){
        TreeNode c=p.right;
        TreeNode t=c.left;
        c.left=p;
        p.right=t;
        return c;
    }
    public TreeNode RightRotate(TreeNode p){
        TreeNode c=p.left;
        TreeNode t=c.right;
        c.right=p;
        p.left=t;
        return c;
    }
    public TreeNode insert1(TreeNode root,int key){

        if(root==null){
            TreeNode node=new TreeNode();
            node.val=key;
            return root;
        }
        if(root.val<key){
            return insert1(root.right, key);
        }else if(root.val>key){
            return insert1(root.left, key);
        }
        return root;
    }
    public void pre(){
        preorder(root);
    }
    private void preorder(TreeNode root){

        if(root==null){
            return ;
        }
        System.out.print(root.val+"->");
        preorder(root.left);
        preorder(root.right);

    }
    public boolean find(int item){
        return find(this.root,item);
    }
    private boolean find(TreeNode node, int item){

        if(node==null){
            return false;
        }
        if(node.val==item){
            return true;
        }

        if(node.val>item)
            return  find(node.left, item);
        else
            return find(node.right, item);

    }
    public int max(){
        return max(root);
    }
    private int max(TreeNode node){
        if(node==null){
            return Integer.MIN_VALUE;
        }
        int Right=max(node.right);

        return Math.max(node.val,Right);
    }
    public TreeNode delete(int item){

        return del(root,item);
    }
    public TreeNode del(TreeNode root,int key){

        if(root==null){
            return null;
        }

        if(root.val>key){
            root.left=del(root.left,key);
        }else if(root.val<key){
            root.right=del(root.right,key);
        }else{

            if(root.left!=null&&root.right!=null){
                int lmax=max(root.left);
                root.val=lmax;
                root.left=del(root.left,lmax);

            }else if(root.left!=null){
                return root.left;
            }else if(root.right!=null){
                return root.right;
            }else{
                return null;
            }
        }
        return root;
    }
    public static void main(String[] args) {
        AVLTree avl=new AVLTree();

        for(int i=0;i<1000;i++){
            avl.insert(i);
        }
        System.out.println(avl.ht());
    }
}