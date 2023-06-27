public interface Deque {
    public void addFirst(Object o);
    public void addLast(Object o);
    public Object removeFirst() throws EmptyDequeException;
    public Object removeLast() throws EmptyDequeException;
    public Object getFirst() throws EmptyDequeException;
    public Object getLast() throws EmptyDequeException;
    public boolean isEmpty();
    public class EmptyDequeException extends RuntimeException{

    }

}
