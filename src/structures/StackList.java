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
    private int size;
    private final StackList next;

    /**
     * creates recursive node
     */
    public StackList() {
        top = null;
        next = null;
        size = 0;
    }

    /**
     *
     * @param n1
     * @param node
     */
    private StackList(E n1, StackList node, int count) {
        data = n1;
        next = node;
        size = count;
    }

    /**
     *
     * @param element
     */
    @Override
    public void push(E element) {
        size++;
        top = new StackList(element, top,size);
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
            item = (E) top.data;
        }
        top = top.next;
        size = top.size;
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
    public int Size() {
        return size;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        String list = "";
        StackList temp = top;
        while (temp != null) {
            list += temp.data.toString() + " ";
            temp = temp.next;
        }
        return list;
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
