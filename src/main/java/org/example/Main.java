public class BinaryTree {
    // Node class
    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    Node root;

    // Constructor
    BinaryTree() {
        root = null;
    }

    // Insert method
    Node insert(Node root, int item) {
        if (root == null) {
            root = new Node(item);
            return root;
        }
        if (item < root.data) {
            root.left = insert(root.left, item);
        } else if (item > root.data) {
            root.right = insert(root.right, item);
        }
        return root;
    }

    // Public method to insert into tree
    void insert(int item) {
        root = insert(root, item);
    }

    // Inorder traversal
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // Display tree
    void display() {
        inorder(root);
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Inorder traversal of the binary search tree:");
        tree.display();
    }
}