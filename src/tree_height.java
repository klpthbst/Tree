import java.io.IOException;

public class tree_height {


    static public void main(String[] args)  {
        new Thread(null, () -> {
            try {
                new tree_height().run();
            } catch (IOException e) {
            }
        }, "1", 1 << 26).start();
    }
    public void run() throws IOException {
        TreeHeight tree = new TreeHeight();
        tree.read();
        System.out.println(tree.computeHeight());
    }
}
