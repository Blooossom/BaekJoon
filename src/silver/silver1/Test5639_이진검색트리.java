package silver.silver1;

import com.sun.source.tree.Tree;

import java.io.*;
public class Test5639_이진검색트리 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        TreeNode root = new TreeNode(Integer.parseInt(br.readLine()));
        String input;
        while (true) {
            input = br.readLine();
            if (input == null || input.equals("")){
                break;
            }
            root.insert(Integer.parseInt(input));
        }
        postorder(root);
    }
    static void postorder(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        postorder(treeNode.left);
        postorder(treeNode.right);
        System.out.println(treeNode.val);
    }
    static class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode right, TreeNode left) {
            this.val = val;
            this.right = right;
            this.left = left;
        }
        public void insert(int param) {
            if (param < this.val) {
                if (this.left == null) {
                    this.left = new TreeNode(param);
                }
                else {
                    this.left.insert(param);
                }
            }
            else {
                if (this.right == null) {
                    this.right = new TreeNode(param);
                }
                else {
                    this.right.insert(param);
                }
            }
        }
    }
}
