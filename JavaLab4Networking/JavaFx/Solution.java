package JavaLab4Networking.JavaFx;


import java.util.ArrayList;
import java.util.List;

class Solution {
    public TreeNode increasingBST(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        insertToList(root,list);
        TreeNode dummy = new TreeNode(-1);
        TreeNode temp = dummy;
        while(!list.isEmpty()){
            temp.right = list.remove(0);
        }
        return dummy.right;
    }

    public void insertToList(TreeNode node, List<TreeNode> list){
        if(node == null) return;
        insertToList(node.left,list);
        list.add(node);
        insertToList(node.right,list);
    }
}
