package org.dsa.dsa.binarysearchtree;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        System.out.println(bst.insert(47));
        System.out.println(bst.insert(21));
        System.out.println(bst.insert(76));
        System.out.println(bst.insert(18));
        System.out.println(bst.insert(52));
        System.out.println(bst.insert(82));
        System.out.println(bst.insert(27));

        System.out.println(bst.rootNode.right.left.value);

        System.out.println(bst);

    }
}
