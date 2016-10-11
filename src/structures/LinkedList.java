/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structures;

import Exceptions.EmptyException;
import Interfaces.ListInterface;

/**
 *
 * @author Atif Hassan
 * @param <E>
 */
public class LinkedList<E> implements ListInterface<E>{

    private Node<E> llpointer;
    private int count = 0;
    /**
     *
     */
    public LinkedList() {
        llpointer = null;
    }
    /**
     * 
     * @param element 
     */
    @Override
    public void add(E element){
        Node<E> newNode = new Node<> (element);
        if(!isEmpty()){
        newNode.setPointer(llpointer);
        }
        llpointer = newNode;
        count++;
    }
    
    /**
     *
     * @return
     */
    @Override
    public boolean isEmpty(){
        return llpointer == null;
    }
    
    @Override
    public String toString(){
        Node<E> current = llpointer;
        String list = "";
        while(current!=null){
            list+=current.getData()+ "";
            current = current.getPointer();
        }
        return list;
    }

    /**
     *
     * @param element
     * @return
     * @throws EmptyException
     */
    @Override
    public E remove(E element) throws EmptyException{
        if (isEmpty()){
         throw new EmptyException("The list is Empty");
        }
        E temp = llpointer.getData();
        llpointer = llpointer.getPointer();
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        /**
         *contains
         *boolean
         *false
         *structures.LinkedList
         *LinkedList
         */
    }

    /**
     *
     * @param element
     * @return
     */
    @Override
    public E get(E element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        /**
         *get
         *E
         *null
         *structures.LinkedList
         *LinkedList
         */
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        /**
         *reset
         *void
         *null
         *structures.LinkedList
         *LinkedList
         */
    }

    /**
     *
     * @return
     */
    @Override
    public E getNext() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        /**
         *getNext
         *E
         *null
         *structures.LinkedList
         *LinkedList
         */
    }

    /**
     *
     * @return
     */
    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        /**
         *hasNext
         *boolean
         *false
         *structures.LinkedList
         *LinkedList
         */
    }
    
}
