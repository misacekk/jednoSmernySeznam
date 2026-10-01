class MyLinkedList {
    private Node head;

    // a. Přidání prvku na konec
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

    // b. Výpis všech prvků seznamu
    public void printAll() {
        if (head == null) {
            System.out.println("Seznam je prázdný.");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.getData());
            if (current.getNext() != null) {
                System.out.print(" -> ");
            }
            current = current.getNext();
        }
        System.out.println();
    }

    // c. Přidání prvku na začátek
    public void addFirst(Ukol value) {
        Node newNode = new Node(value);
        newNode.setNext(head);
        head = newNode;
    }

    // d. Odebrání prvního prvku
    public void removeFirst() {
        if (head != null) {
            head = head.getNext();
        }
    }

    // e. Odebrání prvku z určité pozice (0-based)
    public void removeAt(int index) {
        if (head == null || index < 0) return;

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

    // f. Přidání prvku na určitou pozici (0-based)
    public void addAt(int index, Ukol value) {
        if (index <= 0 || head == null) {
            addFirst(value);
            return;
        }

        Node newNode = new Node(value);
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            if (current.getNext() == null) break;
            current = current.getNext();
        }

        newNode.setNext(current.getNext());
        current.setNext(newNode);
    }

    // g. Výpis prvků s konkrétní prioritou
    public void printAt(int priorita) {
        Node current = head;
        boolean found = false;
        while (current != null) {
            if (current.getData().getPriorita() == priorita) {
                if (found) System.out.print(" | ");
                System.out.print(current.getData());
                found = true;
            }
            current = current.getNext();
        }
        if (!found) {
            System.out.print("Žádný úkol s prioritou " + priorita + " nenalezen.");
        }
        System.out.println();
    }

    // h. Vymazání prvku s určitým názvem
    public void removeByName(String name) {
        if (head == null) return;

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

    // i. Obrácení seznamu
    public void flipList() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        head = prev;
    }
}
