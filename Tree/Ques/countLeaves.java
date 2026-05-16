/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
}*/

class Solution {
    int countLeaves(Node node) {
        if(node == null) return 0;
        int count = 0;
        if(node.left == null && node.right == null) count++;
        count += countLeaves(node.left);
        count += countLeaves(node.right);
        return count;
    }
}
