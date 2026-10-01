public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        System.out.println("---SEZNAM---");
        list.add(new Ukol("Čeština", 2));
        list.add(new Ukol("Angličtina", 3));
        list.add(new Ukol("Java", 1));
        list.add(new Ukol("Literatura", 1));
        list.add(new Ukol("Databáze", 3));
        list.add(new Ukol("SW", 4));
        list.printAll();

        System.out.println("\n---Přidání úkolu na první pozici---");
        list.addFirst(new Ukol("Matematika", 3));
        list.printAll();

        System.out.println("\n---Odebrání úkolu na první pozici---");
        list.removeFirst();
        list.printAll();

        System.out.println("\n---Přidání úkolu na určité pozici (index 2)---");
        list.addAt(2, new Ukol("Fyzika", 4));
        list.printAll();

        System.out.println("\n---Odebrání úkolu na určité pozici (index 4)---");
        list.removeAt(4);
        list.printAll();

        System.out.println("\n---Vypsání úkolů s prioritou 2---");
        list.printAt(2);

        System.out.println("\n---Odebrání úkolů podle názvu (Fyzika)---");
        list.removeByName("Fyzika");
        list.printAll();

        System.out.println("\n---Obrácení seznamu---");
        list.flipList();
        list.printAll();
    }
}
