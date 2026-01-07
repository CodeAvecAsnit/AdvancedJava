package JavaSwingLab2.Practise;


import java.util.*;

class TreeNode {
      public int val;
      public TreeNode left;
      public TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

class Solution {
    public long kthLargestLevelSum(TreeNode root, int k) {
        if(root==null||k==0) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        List<Long> list = new ArrayList<>();
        while(!q.isEmpty()){
            int size = q.size();
            long sum = 0;
            for(int i = 0 ; i < size;++i){
                TreeNode temp = q.remove();
                sum+=temp.val;
                if(temp.right!=null) q.add(temp.right);
                if(temp.left!=null) q.add(temp.left);
            }
            list.add(sum);
        }

        if (k > list.size()) return -1;
        Collections.sort(list, Collections.reverseOrder());
        return list.get(k - 1);
    }
}