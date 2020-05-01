public class Main {
    public static void main(String[] args){
        CircularDoublyLinkedList<String> d = new CircularDoublyLinkedList<>();

        d.insertFront("friday");

        d.insertFront("thursday");
        d.insertFront("monday");
        d.insertFront("saturday");

        d.printAll();

        System.out.print(d.head.getPrevious().getItem());

        d.insertAfter("monday", "a");

        d.printAll();

        System.out.print(d.findNode("thursday").getPrevious().getItem());

        d.insertAfter("thursday", "b");

        d.printAll();

        d.insertPrevious("thursday", "C");

        d.printAll();


        d.removeAfter("a");

        d.printAll();

        d.removePrevious("b");

        d.printAll();
    }
}
