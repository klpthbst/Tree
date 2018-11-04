public class Node {

    private Node left;
    private Node right;
    private int data;



    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    public void addChild(Node node) {

        Node ptr = this;
        Node tmp;
        if (ptr.getLeft() == null) {
            ptr.setLeft(node);
        } else {
            while (ptr.getRight() != null) {
                tmp = ptr.getRight();
                ptr = tmp;
            }
            ptr.setRight(node);
        }
    }

}
