package SList;

import java.util.NoSuchElementException;

public class SList <E> {

    protected Node head;
    private int size;

    public SList(){
        this.head = null;
        this.size = 0;
    }

    public void insertFront(E newItem){
        head = new Node(newItem, head);
        size++;
    }

    public void insertAfter(E newItem, Node p){
        p.setNext(new Node(newItem, p.getNext()));
    }

    public void deleteFront(){
        if(size == 0){
            throw new NoSuchElementException();
        }

        head = head.getNext();
        size--;
    }

    public void deleteAfter(Node p){
        p.setNext(p.getNext().getNext());
        p.getNext().setNext(null);

        size--;
    }

    public int search(E target){
        Node p = head;

        for(int k=0; k < size; k++){
            if(target == p.getItem()) return k;

            p = p.getNext();
        }

        return -1;
    }

    public void print(){
        Node p = head;

        for(int i=0; i<size; i++){
            System.out.print(p.getItem() +"   ");

            p = p.getNext();
        }
    }
}
