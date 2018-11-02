import java.io.IOException;

public class TreeHeight {
    int n;
    int parent[];

    void read() throws IOException {
        FastScanner in = new FastScanner();
        n = in.nextInt();
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = in.nextInt();
        }
    }

    int computeHeight() {
        int maxHeight = 0;
        Node nodes[] = new Node[n];
        Node tmp = null;
        int root = 0;
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node(i);
        }
        for (int i = 0; i < n; i++) {
            if (parent[i] == -1) root = i;
            if (parent[i] == root) {

            }
        }
        return maxHeight;
    }
}