import SList.*;

import java.util.NoSuchElementException;

public class LinkedListStack <E> {
    public Node<E> top;
    public int size;

    public LinkedListStack(){
        top = null;
        size = 0;
    }

    public boolean isEmpty(){
        return (size == 0);
    }

    public void push(E newItem){
        Node<E> newNode  = new Node<E>(newItem, top);
        top = newNode;
        size++;
    }

    public E pop(){
        if(size == 0)
            throw new NoSuchElementException();

        E item = top.getItem();

        top = top.getNext();
        size--;

        return item;
    }

    public E peek(){
        E item = top.getItem();

        return item;
    }

    public void print(){
        Node p = top;

        System.out.print("stack data : ");

        for(int i=0; i< size; i++){
            System.out.print(p.getItem() + "   ");

            p = p.getNext();
        }
        System.out.println();
    }

}
