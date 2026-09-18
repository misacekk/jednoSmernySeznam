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

        System.out.println("---Přidání úkolu na první pozici---");
        list.addFirst(new Ukol("Matematika", 3));
        list.printAll();

        System.out.println("---Odebrání úkolu na první pozici---");
        list.removeFirst();
        list.printAll();

        System.out.println("---Přidání úkolu na určité pozici---");
        list.addAt(2, new Ukol ("Fyzika",4));
        list.printAll();

        System.out.println("---Odebrání úkolu na určité pozici---");
        list.removeAt(4);
        list.printAll();

        System.out.println("---Vypsání úkolů s určitou prioritou---");
        list.printAt(2);

        System.out.println("---Odebrání úkolů podle názvu---");
        list.removeByName("Fyzika");
        list.printAll();

        System.out.println("---Obrácení seznamu---");
        list.flipList();
        list.printAll();
    }
}