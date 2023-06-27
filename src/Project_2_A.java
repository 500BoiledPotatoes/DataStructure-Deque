public class Project_2_A{
    public static class ArrayStack{
        private int maxSize;
        private  int[] values;
        private int top;

        public ArrayStack(int size){
            maxSize=size;
            values=new int[size];
            top=0;
        }
        public int size(){
            return top;
        }
        public boolean isEmpty(){
            return top==0;
        }
        public int top(){
            return values[top-1];
        }
        public void push(int i){
            if (top<maxSize){
                values[top]=i;
                top=top+1;
            }
        }
        public int pop(){
            if (isEmpty()){
                throw new RuntimeException("Stack empty");
            }
            int i=values[top-1];
            top=top-1;
            return i;
        }
        public static void main(String[] args){
            ArrayStack stack=new ArrayStack(7);
            int i=0;
            int j=0;
            int k=0;
            int[] arr={4,5,6,7,12,23,45};
            while (i<7){
                stack.push(arr[i]);
                System.out.println(stack.top());
                i++;
            }
            while (j<3){
                System.out.println(stack.size());
                stack.pop();
                j++;
            }
            stack.push(65);
            while (k<7){
                stack.pop();
                k++;
            }
        }
    }
    public static class LinkStack {
        Node top;
        int size;
        class Node {
            private int data;
            private Node next;
            public Node(int s){
                data=s;
            }
        }


        public void push(int s){
            Node node = new Node(s);
            node.next = top;
            top = node;
            size = size + 1;
        }

        public int pop(){
            if (top==null){
                throw new RuntimeException("Stack empty");
            }
            int temp = top.data;
            top = top.next;
            size = size-1;
            return temp;
        }
        public static void main(String[] args) {
            LinkStack linkedStack = new LinkStack();
            int[] arr={4,5,6,7,12,23,45};
            int i=0;
            while (i<7){
                linkedStack.push(arr[i]);
                System.out.println("linkedStack1 "+linkedStack.top.data);
                i++;
            }
            int j=0;
            while (j<3){
                linkedStack.pop();
                j++;
            }
            linkedStack.push(65);
            int k=0;
            while (k<7){
                linkedStack.pop();
                k++;
            }
        }
    }
    public static class Project_2_A_2 {
        static class Node {
            public int data;
            public Node next;
            public Node(int data) {
                this.data = data;
            }
        }
        static class SingleLinkedList{
            private Node front;
            private Node rear;
            private int size;

            public void enqueue(int i){
                Node n = new Node(i);
                if(size==0){
                    front = n;
                }
                else{
                    rear.next = n;
                }
                rear = n;
                size = size + 1;
            }

            public int dequeue(){
                if (front==null){
                    throw new RuntimeException("Queue empty");
                }
                int i = front.data;
                front = front.next;
                size = size - 1;
                return i;
            }

        }
        public static void main(String[] args) {
            SingleLinkedList q=new SingleLinkedList();
            int[] arr={4,5,6,7,12,23,45};
            int i=0;
            while (i<7){
                q.enqueue(arr[i]);
                System.out.println("LinkedList1 "+q.rear.data);
                i++;
            }
            int j=0;
            while (j<3){
                q.dequeue();
                j++;
            }
            q.enqueue(65);
            int k=0;
            while (k<7){
                q.dequeue();
                k++;
            }
        }
    }

}
