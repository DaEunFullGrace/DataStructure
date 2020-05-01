public class Node <E>{

    private E item;
    private Node<E> next;

    public Node(E item, Node<E> next){
        this.item = item;
        this.next = next;
    }

    public E getItem(){
        return item;
    }

    public Node getNext(){
        return next;
    }

    public void setItem(E item){
        this.item = item;
    }

    public void setNext(Node next){
        this.next = next;
    }
}
