
public class DoubleList <E> {

    protected DNode<E> head;
    protected DNode<E> tail;
    private int size;

    public DoubleList() {
        this.head = null;
        this.size = 0;
    }

    public void insertFront(E newItem) {
        DNode newNode = new DNode(newItem, null, null);

        if (size == 0) {
            tail = newNode;
        } else {
            newNode.setNext(head);
            head.setPrevious(newNode);
        }

        head = newNode;
        size++;
    }

    public void insertLast(E newItem) {
        DNode<E> newNode = new DNode<E>(newItem, null, null);

        newNode.setPrevious(tail);
        tail.setNext(newNode);

        tail = newNode;
    }

    public void insertAfter(E newItem, E inpData) {
        DNode<E> p = findNode(inpData);

        DNode<E> x = p.getNext();

        DNode<E> newNode = new DNode<E>(newItem, p, p.getNext());

        p.setNext(newNode);
        x.setPrevious(newNode);

        size++;
    }

    //문제가 되었던 부분 : 실행 후 print()를 하지 않았다
    public void insertPrevious(E target, E newItem) {
        DNode<E> newNode = new DNode<>(newItem,null,null);

        if(head == null){
            head = newNode;
            tail = newNode;
        } else {
            DNode<E> t = findNode(target);
            DNode<E> p = t.getPrevious();

            newNode.setNext(t);
            newNode.setPrevious(p);

            t.setPrevious(newNode);
            p.setNext(newNode);
        }

        size++;
    }

    public DNode<E> findNode(E data) {
        DNode<E> p = head;

        while (p != null){

            if (p.getItem() == data)
                return p;

            p = p.getNext();
        }
        return null;
    }


//    public void deleteFront(){
//        if(size == 0){
//            throw new NoSuchElementException();
//        }
//
//        head = head.getNext();
//        size--;
//    }
//
//    public void deleteAfter(DNode<E> p){
//        DNode<E> x = p.getNext();
//
//        if(x.getNext() == null){
//            p.setNext(null);
//
//        } else {
//            x.getNext().setPrevious(p);
//            p.setNext(x.getNext());
//
//            x.setNext(null);
//        }
//        x.setPrevious(null);
//
//        size--;
//    }

    public void print(){
        DNode p = head;

        for(int i=0; i<size; i++){
            System.out.print(p.getItem() +"   ");

            p = p.getNext();
        }

        System.out.println();
    }
}