package DSA;

import java.util.*;
public class Tree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    Node root;

    public Tree() {
        root = null;
    }

    public void preorder(Node node) {

        if(node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public void inorder(Node node) {
        if(node == null) {
            return;
        }

        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    public void postorder(Node node) {
        if(node == null) {
            return;
        }

        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {

    Tree tree = new Tree();

    // Constructing the binary tree
    tree.root = new Node(1);

    tree.root.left = new Node(2);
    tree.root.right = new Node(3);

    tree.root.left.left = new Node(4);
    tree.root.left.right = new Node(5);

    tree.root.right.left = new Node(6);
    tree.root.right.right = new Node(7);

    // Preorder Traversal
    System.out.print("Preorder  : ");
    tree.preorder(tree.root);

    System.out.println();

    // Inorder Traversal
    System.out.print("Inorder   : ");
    tree.inorder(tree.root);

    System.out.println();

    // Postorder Traversal
    System.out.print("Postorder : ");
    tree.postorder(tree.root);
}
}