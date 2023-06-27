public class Project_2_C implements Deque{
    private Node first;
    private Node last;
    private int size;


    class Node {
        private Object element;
        Node next;
        Node pre;
        public Node(Object e){
            this.element=e;
        }
        public Object element(){
            return element;
        }
    }

    @Override
    public void addFirst(Object o) {
        Node n= new Node(o);
        if (isEmpty()){
            first=n;
            last=n;
        }else{
            first.pre=n;
            n.next=first;
            first=n;

        }
        size=size+1;
    }

    @Override
    public void addLast(Object o) {
        Node n= new Node(o);
        if (isEmpty()){
            last=n;
            first=n;
        }else{
            last.next=n;
            n.pre=last;
            last=n;
}
        size=size+1;
                }

@Override
public Object removeFirst() throws EmptyDequeException {
        if (isEmpty()){
        throw new EmptyDequeException();
        }
        Object o=first.element();
        first=first.next;
        if (size==1){
        first=null;
        last=null;
        }else{
        first.pre=null;
        }
        size=size-1;
        return o;
        }

@Override
    public Object removeLast() throws EmptyDequeException {
        if (isEmpty()){
            throw new EmptyDequeException();
        }
        Object o=last.element();
        last=last.pre;
        if (size==1){
            first=null;
            last=null;
        }else{
            last.next=null;
        }
        size=size-1;
        return o;
    }

    @Override
    public Object getFirst() throws EmptyDequeException {
        return null;
    }

    @Override
    public Object getLast() throws EmptyDequeException {
        return null;
    }


    @Override
    public boolean isEmpty() {
        return first == null;
    }

    public void print(){
        Node temp = first;
        while(temp != null){
            System.out.print(temp.element+",");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {

        Project_2_C d=new Project_2_C();

        d.addFirst("111");
        d.addLast(1);
        d.addFirst(2);
        d.removeFirst();
        d.removeLast();
        d.print();

    }

}
