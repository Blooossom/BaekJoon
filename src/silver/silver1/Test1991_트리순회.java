package silver.silver1;

import java.io.*;
public class Test1991_트리순회 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Tree tree = new Tree();

        for (int i = 0; i < N; i++) {
            char[] data;
            data = br.readLine().replaceAll(" ","").toCharArray();

            tree.createTreeNode(data[0], data[1], data[2]);
        }
        tree.preorder(tree.root);
        System.out.println();
        tree.inorder(tree.root);
        System.out.println();
        tree.postorder(tree.root);
    }
    static class TreeNode {
        char data;
        TreeNode left;
        TreeNode right;

        public TreeNode(char data) {
            this.data = data;
        }
    }
    static class Tree {
        TreeNode root;

        public void createTreeNode (char data, char leftData, char rightData) {
            if (root == null) {
                root = new TreeNode(data);

                if (leftData != '.') {
                    root.left = new TreeNode(leftData);
                }
                if (rightData != '.') {
                    root.right = new TreeNode(rightData);
                }
            }
            else {
                searchTreeNode(root, data, leftData, rightData);
            }
        }
        public void searchTreeNode(TreeNode root, char data, char leftData, char rightData){
            if (root == null) {
                return;
            }
            else if (root.data == data) {
                if (leftData != '.') {
                    root.left = new TreeNode(leftData);
                }
                if (rightData != '.') {
                    root.right = new TreeNode(rightData);
                }
            }
            else {
                searchTreeNode(root.left, data, leftData, rightData);
                searchTreeNode(root.right, data, leftData, rightData);
            }
        }
        public void preorder(TreeNode root) {
            System.out.print(root.data);
            if (root.left != null) {
                preorder(root.left);
            }
            if (root.right != null) {
                preorder(root.right);
            }
        }
        public void postorder(TreeNode root) {
            if (root.left != null) {
                postorder(root.left);
            }
            if (root.right != null) {
                postorder(root.right);
            }
            System.out.print(root.data);
        }
        public void inorder(TreeNode root) {
            if (root.left != null) {
                inorder(root.left);
            }
            System.out.print(root.data);
            if (root.right != null) {
                inorder(root.right);
            }
        }
    }
}
