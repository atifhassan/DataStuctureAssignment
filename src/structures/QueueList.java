/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structures;

import Exceptions.EmptyException;
import Exceptions.FullException;
import Interfaces.QueueInterface;

/**
 *
 * @author atifm
 * @param <E>
 */
public class QueueList<E> implements QueueInterface<E> {

    private int front;
    private int back;
    private final int CAPACITY;
    private int size = 0;

    QueueList() {
        CAPACITY = 10;
    }

    QueueList(int size) {
        CAPACITY = size;
    }

    /**
     *
     * @param element
     * @throws Exceptions.FullException
     */
    @Override
    public void Enqueue(E element) throws FullException {
        if (isFull()) {
            throw new FullException();
        } else if (back == CAPACITY) {
            back = 0;
        } else {
            back++;
        }
        size++;
    }

    /**
     *
     * @return
     */
    @Override
    public E Dequeue() throws EmptyException {
        if (isEmpty()) {
            throw new EmptyException();
        }
        else if (front == CAPACITY){
            front = 0;
        } else{
            front++;
        }
        E element = null;
        size--;
        return element;
    }

    @Override
    public String toString() {
        return "hi";
    }

    /**
     *
     * @return
     */
    @Override
    public boolean isFull() {
        return size == CAPACITY;
    }

    /**
     *
     * @return
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     *
     * @return
     */
    @Override
    public int size() {
        return size;
    }
}
