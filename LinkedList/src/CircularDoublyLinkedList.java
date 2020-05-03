public class CircularDoublyLinkedList<T> implements ICircularDoubleLinkedList<T> {

    protected DNode<T> head;
    private int size;

    public CircularDoublyLinkedList(){
        this.head = new DNode<>(null, null,null);
        this.size = 0;
    }

    public DNode<T> findNode(T data){
        DNode<T> p = head;

        for(int i=0; i<size; i++){
            if(p.getItem() == data){
                return p;
            }
            p = p.getNext();
        }
        return null;
    }

    public void insertFront(T data){
        DNode<T> newNode = new DNode<>(data, null, null);

        if(head.getNext() == null){
            newNode.setNext(newNode);
            newNode.setPrevious(newNode);
        }else{
            newNode.setNext(head);
            newNode.setPrevious(head.getPrevious());
            head.setPrevious(newNode);
        }

        head = newNode;
        head.getPrevious().setNext(head);

        size++;
    }

    @Override
    public void insertAfter(T target, T data) {
        DNode<T> newNode = new DNode<>(data, null, null);

        DNode<T> t = findNode(target);
        DNode<T> x = t.getNext();

        newNode.setNext(x);
        newNode.setPrevious(t);

        t.setNext(newNode);
        x.setPrevious(newNode);

        size++;
    }

    @Override
    public void insertPrevious(T target, T data) {
        DNode<T> newNode = new DNode<>(data, null, null);

        DNode<T> t = findNode(target);
        DNode<T> p = t.getPrevious();

        newNode.setNext(t);
        newNode.setPrevious(p);

        p.setNext(newNode);
        t.setPrevious(newNode);

        size++;
    }

    public void removeFront(){
        if(head == null)
            throw new NullPointerException("List is Empty");

        DNode<T> x = head.getNext();

        x.setPrevious(head.getPrevious());
        head.getPrevious().setNext(x);

        head = x;

        size--;
    }

    @Override
    public void removeAfter(T target) {

        if(head == null)
            throw new NullPointerException("List is Empty");

        DNode<T> t = findNode(target);
        DNode<T> x = t.getNext();

        t.setNext(x.getNext());
        x.getNext().setPrevious(t);

        size--;

    }

    @Override
    public void removePrevious(T target) {

        if(head == null)
            throw new NullPointerException("List is Empty");

        DNode<T> t = findNode(target);
        DNode<T> p = t.getPrevious();

        p.getPrevious().setNext(t);
        t.setPrevious(p.getPrevious());

        size--;
    }

    @Override
    public boolean search(T data) {
        DNode<T> p = head;

        for(int i=0; i<size; i++){
            if(data == p.getItem())
                return true;

            p = p.getNext();
        }
        return false;
    }

    @Override
    public void printAll() {
        DNode<T> p = head;

        System.out.println("head : " + head.getItem());
        System.out.println("size : " + size);

        for(int i=0; i<size; i++){
            System.out.print(p.getItem() +"   " );

            p = p.getNext();
        }

        System.out.println();
    }
}
