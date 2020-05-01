public class DNode <E> {

    private E item;
    private DNode<E> nextLink;
    private DNode<E> preLink;

    public DNode(E item, DNode<E> preLink, DNode<E> nextLink){
        this.item = item;
        this.nextLink = nextLink;
        this.preLink = preLink;
    }

    public E getItem(){
        return item;
    }

    public DNode<E> getNext(){
        return nextLink;
    }

    public DNode<E> getPrevious(){
        return preLink;
    }

    public void setItem(E item){
        this.item = item;
    }

    public void setNext(DNode<E> next){
        this.nextLink = next;
    }

    public void setPrevious(DNode<E> pre){
        this.preLink = pre;
    }
}
