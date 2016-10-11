package structures;

/**
 *
 * @author Atif
 */
import Exceptions.EmptyException;
import Interfaces.StackInterface;

/**
 *
 * @author atifm
 * @param <E>
 */
public class StackList<E> implements StackInterface<E> {

    private static StackList top;
    private E data;
    private static int size = 0;
    private final StackList next;

    /**
     *
     */
    public StackList() {
        top = null;
        next = null;
    }

    /**
     *
     * @param n1
     * @param node
     */
    private StackList(E n1, StackList node) {
        data = n1;
        next = node;
    }

    /**
     *
     * @param element
     */
    @Override
    public void push(E element) {
        size++;
        top = new StackList(element, top);
    }

    /**
     *
     * @return
     */
    @Override
    public E top() throws EmptyException{
        if (isEmpty()) {
            throw new EmptyException();
        }
        return (E) top.data;
    }

    /**
     *
     * @return
     */
    @Override
    public E pop() throws EmptyException{
        E item;
        if (isEmpty()) {
            throw new EmptyException();
        } else {
            size--;
            item = (E) top.data;
        }
        top = top.next;
        return (item);
    }

    /**
     *
     * @return
     */
    @Override
    public boolean isEmpty() {
        return top == null;
    }

    /**
     *
     * @return
     */
    @Override
    public int size() {
        return size;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "hi";
    }

    /**
     *
     * @return false
     */
    @Override
    public boolean isFull() {
        return false;
    }
}
