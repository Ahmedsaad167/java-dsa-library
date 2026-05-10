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

    public boolean delete(int key) {
        TreeNode current = root;
        TreeNode parent = root;
        boolean isLeft = true;
        while (current != null && current.data != key) {
            parent = current;
            if (current.data > key) {
                isLeft = true;
                current = current.leftChild;
            }
            else {
                isLeft = false;
                current = current.rightChild;
            }
        }
        if (current == null)
            return false;

        if (current.leftChild == null && current.rightChild == null) {
            if (current == root)
                root = null;
            else if (isLeft)
                parent.leftChild = null;
            else
                parent.rightChild = null;
        }

        else if (current.leftChild == null) {
            if (current == root)
                root = current.rightChild;
            else if (isLeft)
                parent.leftChild = current.rightChild;
            else
                parent.rightChild = current.rightChild;
        }

        else if (current.rightChild == null) {
            if (current == root)
                root = current.leftChild;
            else if (isLeft)
                parent.leftChild = current.leftChild;
            else
                parent.rightChild = current.leftChild;
        }

        else {
            TreeNode successor = getSuccessor(current);
            if (current == root)
                root = successor;
            else if (isLeft)
                parent.leftChild = successor;
            else
                parent.rightChild = successor;
            successor.leftChild = current.leftChild;
        }
        return true;

    }

    private TreeNode getSuccessor(TreeNode node) {
        TreeNode successorParent = node;
        TreeNode successor = node;
        TreeNode current = node.rightChild;
        while (current != null) {
            successorParent = successor;
            successor = current;
            current = current.leftChild;
        }
        if (successor != node.rightChild) {
            successorParent.leftChild = successor.rightChild;
            successor.rightChild = node.rightChild;
        }
        return successor;

    }

    public void inorder() {
        System.out.print("Tree (Inorder): ");
        recInorder(root);
        System.out.println();
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
        System.out.println();
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
        System.out.println();
    }

    private void recPostorder(TreeNode node) {
        if (node != null) {
            recPostorder(node.leftChild);
            recPostorder(node.rightChild);
            System.out.print(node.data + "  ");
        }
    }
}
