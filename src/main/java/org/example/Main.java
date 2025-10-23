#include <iostream>
using namespace std;

class bT {
    struct node {
        int data;
        node* left;
        node* right;
        node(int val) : data(val), left(NULL), right(NULL) {}
    };

    node* root;

    node* insert(node* root, int item) {
        if (root == NULL) {
            return new node(item);
        }
        if (item < root->data) {
            root->left = insert(root->left, item);
        } else if (item > root->data) {
            root->right = insert(root->right, item);
        }
        return root;
    }

    public:
    bT() : root(NULL) {}

    void insert(int item) {
        root = insert(root, item);
    }

    void inorder(node* temp) {
        if (temp == NULL) return;
        inorder(temp->left);
        cout << temp->data << " ";
        inorder(temp->right);
    }

    void display() {
        inorder(root);
        cout << endl;
    }
};

int main() {
    bT tree;
    tree.insert(50);
    tree.insert(30);
    tree.insert(70);
    tree.insert(20);
    tree.insert(40);
    tree.insert(60);
    tree.insert(80);

    cout << "Inorder traversal of the binary search tree:\n";
    tree.display();

    return 0;
}