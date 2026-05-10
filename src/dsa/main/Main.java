package dsa.main;

import dsa.tree.BinarySearchTree;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(50);
        bst.insert(25);
        bst.insert(75);
        bst.insert(10);

        System.out.println(bst.find(25));
        System.out.println(bst.find(100));
    }
}