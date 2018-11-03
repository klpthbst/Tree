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
        int root = -1;
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node(parent[i]);
        }

        for (int i = 0; i < nodes.length; i++) {
            if(nodes[i].getData() == -1) {
                //its root
                root = i;
            } else if (nodes[i].getData() == root) {
                nodes[root].addChild(nodes[i]);
                System.out.println("root!");
            } else {
                nodes[nodes[i].getData()].addChild(nodes[i]);
                System.out.println("Not root!");

            }
        }

        return maxHeight;
    }
}