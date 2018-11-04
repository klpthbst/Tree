import java.io.IOException;

public class TreeHeight {
    int n;
    int parent[];
    Node tree;

    void read() throws IOException {
        FastScanner in = new FastScanner();
        n = in.nextInt();
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = in.nextInt();
        }
        tree = createTree(parent, n);
    }

    Node createTree(int arr[], int size) {

        Node nodes[] = new Node[size];
        int root = -1;
        for (int i = 0; i < size; i++) {
            nodes[i] = new Node(arr[i]);
        }

        for (int i = 0; i < nodes.length; i++) {
            if(nodes[i].getData() == -1) {
                root = i;
            } else {
                nodes[nodes[i].getData()].addChild(nodes[i]);
            }
        }
        return nodes[root];
    }

    int height(Node tree) {
        if(tree == null)
            return 0;
        return 1 + height(tree.getLeft());

    }
    int computeHeight() {
        int maxHeight = 0;
        int height;
        while (tree != null) {
            height = height(tree);
            maxHeight = height > maxHeight ? height : maxHeight;
            tree = tree.getRight();
        }
        return maxHeight;
    }
}