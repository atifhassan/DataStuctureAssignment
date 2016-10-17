/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structures;

import Exceptions.EmptyException;
import Exceptions.NullElementException;
import Interfaces.ListInterface;

/**
 *
 * @author Atif Hassan
 * @param <E>
 */
public class LinkedList<E extends Comparable> implements ListInterface<E> {

    private Node<E> headPointer;
    private Node<E> currentPointer;
    private Node<E> prevPointer;
    private int count = 0;

    /**
     *
     */
    public LinkedList() {
        headPointer = null;
    }

    /**
     *
     * @param element
     */
    @Override
    public void add(E element) {
//        Node<E> newNode = new Node<>(element);
//        if (!isEmpty()) {
//            newNode.setPointer(headPointer);
//        }
//        if ((headPointer.equals(currentPointer))) {
//
//        } else {
//
//        }
//        headPointer = newNode;
//        count++;

        Node<E> newNode = new Node<>(element);
        if (isEmpty()) {
            newNode.setPointer(headPointer);
            headPointer = newNode;
        } else {
            currentPointer = headPointer;
            prevPointer = headPointer;
            while (currentPointer != null) {
                if (element.compareTo(currentPointer.getData()) > 0) {
                    prevPointer = currentPointer;
                    currentPointer = currentPointer.getPointer();
                } else if (headPointer.equals(currentPointer)) {
                    //insert at beginning
                    newNode.setPointer(headPointer);
                    headPointer = newNode;
                    break;
                } else {
                    //insert in before current
                    newNode.setPointer(currentPointer);
                    prevPointer.setPointer(newNode);
                    break;
                }
            }
            //insert at end
            if (currentPointer == null) {
                prevPointer.setPointer(newNode);
            }
        }
        count++;
    }

    /**
     *
     * @return
     */
    @Override
    public boolean isEmpty() {
        return headPointer == null;
    }

    @Override
    public String toString() {
        Node<E> temp = headPointer;
        String list = "";
        while (temp != null) {
            list += temp.getData() + " ";
            temp = temp.getPointer();
        }
        return list;
    }

    /**
     *
     * @param element
     * @return
     * @throws EmptyException
     * @throws Exceptions.NullElementException
     */
    @Override
    public E remove(E element) throws EmptyException, NullElementException {
        if (isEmpty()) {
            throw new EmptyException("The list is Empty");
        }
        if (!contains(element)) {
            throw new NullElementException("Element does not exist");
        }

        Node<E> currentTemp = headPointer;
        E temp = currentTemp.getData();
        if (temp != element) {
            Node<E> previous;
            do {
                previous = currentTemp;
                currentTemp = currentTemp.getPointer();
                temp = currentTemp.getData();
            } while (temp != element);
            previous.setPointer(currentTemp.getPointer());
        } else {
            headPointer = headPointer.getPointer();
        }
        count--;
        return temp;
    }

    /**
     *
     * @param element
     * @return
     */
    @Override
    public boolean contains(E element) {
        E temp;
        Node<E> currentTemp = headPointer;
        boolean contains = false;
        while (currentTemp != null) {
            temp = currentTemp.getData();
            if (temp == element) {
                contains = true;
            }
            currentTemp = currentTemp.getPointer();
        }
        return contains;
    }

    /**
     *
     * @param element
     * @return
     * @throws Exceptions.EmptyException
     * @throws Exceptions.NullElementException
     */
    @Override
    public E get(E element) throws EmptyException, NullElementException {
        if (isEmpty()) {
            throw new EmptyException("The list is Empty");
        }
        if (!contains(element)) {
            throw new NullElementException("Element does not exist");
        }
        Node<E> tempPointer = headPointer;
        E temp = tempPointer.getData();
        do {
            tempPointer = tempPointer.getPointer();
            temp = tempPointer.getData();
        } while (temp != element);
        return temp;
    }

    /**
     *
     * @return
     */
    @Override
    public int size() {
        return count;
    }

    /**
     *
     */
    @Override
    public void reset() {
        headPointer = null;
        currentPointer = null;
        prevPointer = null;
    }

    /**
     *
     * @return
     */
    @Override
    public E getNext() {
        E temp = currentPointer.getPointer().getData();
        currentPointer = currentPointer.getPointer();
        return temp;
    }

    /**
     *
     * @return
     */
    @Override
    public boolean hasNext() {
        return currentPointer != null;
    }

}
