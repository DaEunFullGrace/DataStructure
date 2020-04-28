public class Main {
    public static void main(String[] args){
        ArrayStack<String> a = new ArrayStack<String>();

        System.out.println("1. Array Stack");

        a.push("apple");
        a.push("banana");
        a.push("cherry");

        a.print();

        System.out.println(a.peek());

        System.out.println(a.pop());
        a.print();

        System.out.println("2. Linked List Stack");

        LinkedListStack<String> l = new LinkedListStack<>();

        l.push("apple");
        l.push("banana");

        l.print();

        System.out.println(l.pop());

        l.print();
    }
}
