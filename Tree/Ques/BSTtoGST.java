class Solution {
    int sum = 0; // Global Sum Variable 
    public TreeNode convertBST(TreeNode root) {
        if(root == null) return null;

        convertBST(root.right); // right Node

        sum += root.val; 
        root.val = sum;

        convertBST(root.left); // left Node

        return root;
    }
}



// Example + problem statement -- very Imp - for generating Logic

// Given diagram ko dhyaan se dekho usme jo numbers h vo BST ke form me h left.val < root.val < right.val 
// and hm logo ko kisi bhi number ke greater nums ka sum uss place pe update krna h to left me jane ka koi mtlb nhi h 
// right me aayenge and last tk jayenge phir uss node pe uske left - null + right - null + root.val krenge phir backtrack hoga 
// aise hi phle pura right kr lenge phir left kyuki left me smaller values thi na 
