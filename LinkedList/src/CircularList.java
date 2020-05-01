public class CircularList <E>{

    public Node last;
    private int size;

    public CircularList(){
        this.last = null;
        this.size = 0;
    }

    public void insert(E newItem){
        Node newNode = new Node(newItem, null);

        if(last == null){
            newNode.setNext(newNode);
            last = newNode;
        }else{
            newNode.setNext(last.getNext());
            last.setNext(newNode);
        }
        size++;
    }

    public void insertAfter(E newItem, Node p){
        Node newNode = new Node(newItem, p.getNext());
        p.setNext(newNode);
    }

    public int delete(){
        if(last == null){
            System.out.println("There is no data!");
            return -1;
        }

        Node x = last.getNext();

        if(x == last){
            last = null;
        }
        else{
            last.setNext(x.getNext());
            x.setNext(null);
        }
        size--;
        return 1;
    }

    public void deleteAfter(Node p){
        Node x = p.getNext();

        p.setNext(x.getNext());
        x.setNext(null);
    }

    public void print(){
        Node p = last;
        System.out.print("last : " + last.getItem() + ",  ");

        for(int i=0; i<size; i++){
            System.out.print(p.getItem() +"   ");

            p = p.getNext();
        }
        System.out.println();
    }
}
