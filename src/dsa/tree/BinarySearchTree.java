package dsa.tree;

public class BinarySearchTree {
    private TreeNode root;

    public void insert(int value) {
        TreeNode newNode = new TreeNode(value);
        if (root == null) {
            root = newNode;
            return;
        }
        TreeNode current = root;
        TreeNode parent;

        while (true) {
            parent = current;
            if (current.data > value) {
                current = current.leftChild;
                if (current == null) {
                    parent.leftChild = newNode;
                    return;
                }
            }
            else {
                current = current.rightChild;
                if (current == null) {
                    parent.rightChild = newNode;
                    return;
                }
            }
        }
    }

    public boolean find(int key) {
        TreeNode current = root;

        while (current != null) {
            if (current.data == key)
                return true;
            else if (current.data > key)
                current = current.leftChild;
            else
                current = current.rightChild;
        }
        return false;
    }
}
