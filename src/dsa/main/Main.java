package dsa.main;

import dsa.tree.BinarySearchTree;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(50);
        bst.insert(25);
        bst.insert(75);
        bst.insert(10);
        bst.insert(30);
        bst.insert(60);
        bst.insert(90);

        bst.inorder();
        System.out.println();

        bst.preorder();
        System.out.println();

        bst.postorder();
    }
}