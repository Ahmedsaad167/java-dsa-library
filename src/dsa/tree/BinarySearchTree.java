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

    public void inorder() {
        System.out.print("Tree (Inorder): ");
        recInorder(root);
        System.out.println("");
    }
    
    private void recInorder(TreeNode node) {
        if (node != null) {
            recInorder(node.leftChild);
            System.out.print(node.data + "  ");
            recInorder(node.rightChild);
        }
    }
    
    public void preorder() {
        System.out.print("Tree (Preorder): ");
        recPreorder(root);
        System.out.println("");
    }
    
    private void recPreorder(TreeNode node) {
        if (node != null) {
            System.out.print(node.data + "  ");
            recPreorder(node.leftChild);
            recPreorder(node.rightChild);
        }
    }
    
    public void postorder() {
        System.out.print("Tree (Postorder): ");
        recPostorder(root);
        System.out.println("");
    }

    private void recPostorder(TreeNode node) {
        if (node != null) {
            recPostorder(node.leftChild);
            recPostorder(node.rightChild);
            System.out.print(node.data + "  ");
        }
    }
}
