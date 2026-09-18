public class MyLinkedList {
    private Node head;

    public void add(Ukol value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(newNode);
    }
    public void printAll() {
        Node current = head;
        while (current != null) {
            System.out.print(current.getData() + " -> ");
            current = current.getNext();
        }
        System.out.println(" ");
    }
    public void addFirst(Ukol value) {
        Node newNode = new Node(value);
        newNode.setNext(head);
        head = newNode;
    }

    public void removeFirst() {
        if (head != null) {
            head = head.getNext();
        }
    }

    public void removeAt(int index) {
        if (index == 0) {
            head = head.getNext();
            return;
        }
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            if (current.getNext() == null) {
                return;
            }
            current = current.getNext();
        }

        if (current.getNext() != null) {
            current.setNext(current.getNext().getNext());
        }
    }


    public void addAt(int index, Ukol value) {
        Node newNode = new Node(value);
        if (index == 0) {
            newNode.setNext(head);
            head = newNode;
            return;
        }
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.getNext();
        }
        newNode.setNext(current.getNext());
        current.setNext(newNode);
    }

    public void printAt(int priorita) {
        Node current = head;
        while (current != null) {
            if (current.getData().getPriorita() == priorita) {
                System.out.print(current.getData() + " (" + current.getData().getPriorita() + ")");
            }
            current = current.getNext();
        }
        System.out.println();
    }

    public void removeByName(String name) {
        if (head.getData().getNazev().equalsIgnoreCase(name)) {
            head = head.getNext();
            return;
        }
        Node current = head;
        while (current.getNext() != null) {
            if (current.getNext().getData().getNazev().equalsIgnoreCase(name)) {
                current.setNext(current.getNext().getNext());
                return;
            }
            current = current.getNext();
        }
    }

    public void flipList() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.getNext(); // Uložení následujícího prvku
            current.setNext(prev);    // Otočení ukazatele
            prev = current;           // Posun prev dopředu
            current = next;           // Posun current dopředu
        }
        head = prev; // Nová hlavička je původně poslední prvek
    }
}