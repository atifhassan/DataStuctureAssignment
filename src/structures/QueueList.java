/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structures;

import Interfaces.QueueInterface;
import classes.User;

/**
 *
 * @author atifm
 * @param <E>
 */
public class QueueList<E> implements QueueInterface<E>{

    private static QueueList front; 
    private User data;
    private static QueueList back;
    
    QueueList() {
        front = null;
        back = null;
    }
    QueueList(User n1, QueueList node) {
        data = n1;
        back = node;
    }

    /**
     *
     */
    public void enqueue() {

    }

    /**
     *
     */
    public void dequeue() {

    }
    
    @Override
    public String toString() {
        return "hi";
    }

    /**
     *
     */
    @Override
    public void Enqueue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        /**
         *Enqueue
         *void
         *null
         *structures.QueueList
         *QueueList
         */
    }

    /**
     *
     */
    @Override
    public void Dequeue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        /**
         *Dequeue
         *void
         *null
         *structures.QueueList
         *QueueList
         */
    }

    /**
     *
     * @return
     */
    @Override
    public boolean isFull() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        /**
         *isFull
         *boolean
         *false
         *structures.QueueList
         *QueueList
         */
    }

    /**
     *
     * @return
     */
    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        /**
         *isEmpty
         *boolean
         *false
         *structures.QueueList
         *QueueList
         */
    }

    /**
     *
     * @return
     */
    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        /**
         *size
         *int
         *0
         *structures.QueueList
         *QueueList
         */
    }
}
