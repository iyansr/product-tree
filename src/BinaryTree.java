import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    Node root;
    public void insert(Product product) {
        if (this.root == null) {
            this.root = new Node(product);
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(this.root);

        while (!q.isEmpty()) {
            Node current = q.peek();
            q.remove();

            if (current.left == null) {
                current.left = new Node(product);
                break;
            } else {
                q.add(current.left);
            }

            if (current.right == null) {
                current.right = new Node(product);
                break;
            } else {
                q.add(current.right);
            }
        }
    }


    // Method to print the tree in preorder traversal
    void preorder() {
        preorderRec(this.root);
    }

    // A recursive function to do preorder traversal
    void preorderRec(Node root) {
        if (root != null) {
            System.out.println(root.product.toString());
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    private Product recursiveSearch(Node root, String name) {
        if (root == null) {
            return null;
        }

        if (root.product.getName().equals(name)) {
            return root.product;
        }


        Product leftSearch = recursiveSearch(root.left, name);
        if (leftSearch != null) {
            return leftSearch;
        }

        return recursiveSearch(root.right, name);
    }

    public Product search(String name) {
        return recursiveSearch(root, name);
    }
}
