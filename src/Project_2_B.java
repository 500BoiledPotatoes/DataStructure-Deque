public class Project_2_B {
    private Node first;
    private Node last = first;
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

    public Node getFirst() {
        return first;
    }


    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(Object d) {
        Node node = new Node(d);
        if (isEmpty()) {
            last=node;
        } else {
            first.pre = node;
        }
        node.next = first;
        first = node;
    }

    public void insertLast(Object d) {
        Node node = new Node(d);
        if (isEmpty()) {
            first = node;
        } else {
            node.pre = last;
            last.next = node;
        }
        last = node;
    }

    public void insertAfter(Object p, Object d) {
        Node node = new Node(d);
        Node temp = first;
        while ((temp != null) && (temp.element() != p)) {
            temp = temp.next;
        }
        if (temp == null) {
            if (isEmpty()) {
                first = node;
                last = node;
            } else {
                last.next = node;
                node.pre = last;
                last = node;
            }
        } else {
            if (temp == last) {
                node.next = null;
                last = node;
            } else {
                node.next = temp.next;
                temp.next.pre = node;
            }
            temp.next = node;
            node.pre = temp;
        }
    }

    public void insertBefore(Object p, Object d) {
        Node node = new Node(d);
        Node temp = last;
        while ((temp != null) && (temp.element() != p)) {
            temp = temp.next;
        }
        if (temp == null) {
            if (isEmpty()) {
                last = node;
                first = node;
            } else {
                first.pre = node;
                node.next = first;
                first = node;
            }
        } else {
            if (temp == first) {
                node.pre = null;
                first = node;
            } else {
                node.pre = temp.pre;
                temp.pre.next = node;
            }
            temp.pre = node;
            node.next = temp;
        }
    }

    public Node remove(Object p) {
        Node temp = first;
        while ((temp != null) && (temp.element() != p)) {
            temp = temp.next;
        }
        if (temp == null) {
            return null;
        } else {
            if (temp == first) {
                first = temp.next;
                temp.next.pre = null;
            } else if (temp == last) {
                last = temp.next;
                temp.next.pre = null;
            } else {
                temp.pre.next = temp.next;
                temp.next.pre = temp.pre;
            }
        }
        return temp;
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

        Project_2_B doubledList= new Project_2_B();
        doubledList.insertFirst(111);
        doubledList.insertLast(1);
        doubledList.insertBefore(1,"aa");
        doubledList.insertAfter(1,"aa");
        doubledList.remove(1);
        doubledList.print();

    }
}
