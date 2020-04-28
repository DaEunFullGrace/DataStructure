
public class ArrayStack<E> {
    public E[] stack;
    public int top;

    //init
    public ArrayStack(){
        stack = (E[])new Object[10];
        top = -1;
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == stack.length-1);
    }

    public void push(E newItem){
        try {
            stack[++top] = newItem;
        } catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }

    }

    public E pop(){
        E item;

        if(!isEmpty()){
            item = stack[top--];
            return item;
        }

        System.out.println("stack is empty");
        return null;
    }

    public E peek(){
        if(!isEmpty())
            return stack[top];

        System.out.println("stack is empty");
        return null;
    }

    public void print(){
        System.out.print("stack data : ");
        for(int i=0; i<= top; i++){
            System.out.print(stack[i] + "(" + String.valueOf(i == top) + ")  ");
        }
        System.out.println();
    }
}
