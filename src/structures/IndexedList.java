/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structures;

import Exceptions.EmptyException;
import Interfaces.IndexedListInterface;

/**
 *
 * @author atifm
 * @param <E>
 */
public class IndexedList<E extends Comparable> extends LinkedList<E> implements IndexedListInterface<E>{

    /**
     *
     */
    public void add() {

    }

    /**
     *
     */
    public void remove() {

    }

    /**
     *
     */
    public void contains() {
    }

    /**
     *
     */
    public void get() {
    }

    @Override
    public String toString() {
        return "test";
    }

    /**
     *
     */
    @Override
    public void reset() {

    }
    
    @Override
    public void add(E element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        /**
         *add
         *void
         *null
         *structures.IndexedList
         *IndexedList
         */
    }

    @Override
    public E remove(E element) throws EmptyException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        /**
         *remove
         *E
         *null
         *structures.IndexedList
         *IndexedList
         */
    }

    @Override
    public boolean contains(E element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        /**
         *contains
         *boolean
         *false
         *structures.IndexedList
         *IndexedList
         */
    }

    @Override
    public E get(E element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        /**
         *get
         *E
         *null
         *structures.IndexedList
         *IndexedList
         */
    }

    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        /**
         *hasNext
         *boolean
         *false
         *structures.IndexedList
         *IndexedList
         */
    }

    @Override
    public E getNext() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        /**
         *getNext
         *E
         *null
         *structures.IndexedList
         *IndexedList
         */
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        /**
         *isEmpty
         *boolean
         *false
         *structures.IndexedList
         *IndexedList
         */
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        /**
         *size
         *int
         *0
         *structures.IndexedList
         *IndexedList
         */
    }
}
