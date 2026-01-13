package algorithms;

import java.util.Scanner;

/*
Input:
- n: number of values to insert into BST
- n integers: values to insert
- target: value to search

Output:
- Inorder traversal (sorted order)
- Search result (Found / Not found)
*/
public class A30_BinarySearchTree {

    // Node class
    static class Node {
        int value;
        Node left, right;

        Node(int value) {
            this.value = value;
        }
    }

    // Insert into BST
    static Node insert(Node root, int value) {
        if (root == null) return new Node(value);

        if (value < root.value) {
            root.left = insert(root.left, value);
        } else if (value > root.value) {
            root.right = insert(root.right, value);
        }
        // if value == root.value, ignore duplicates
        return root;
    }

    // Search in BST
    static boolean search(Node root, int target) {
        if (root == null) return false;

        if (target == root.value) return true;
        if (target < root.value) return search(root.left, target);
        return search(root.right, target);
    }

    // Inorder traversal (prints sorted values)
    static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.value + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of values to insert (n): ");
        int n = input.nextInt();

        Node root = null;

        System.out.println("Enter " + n + " integers to insert into BST:");
        for (int i = 0; i < n; i++) {
            int value = input.nextInt();
            root = insert(root, value);
        }

        System.out.print("BST inorder traversal (sorted): ");
        inorder(root);
        System.out.println();

        System.out.print("Enter a value to search: ");
        int target = input.nextInt();

        if (search(root, target)) {
            System.out.println("Found !");
        } else {
            System.out.println("Not found!");
        }
    }
}
