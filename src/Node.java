public class Node {
    private Ukol data;
    private Node next;

    Node(Ukol data) {
        this.data = data;
        this.next = null;
    }

    public Ukol getData() { return data; }
    public void setData(Ukol data) { this.data = data; }

    public Node getNext() { return next; }
    public void setNext(Node next) { this.next = next; }
}