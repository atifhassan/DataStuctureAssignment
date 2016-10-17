/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author Atif Hassan
 * @param <E>
 */
public interface InteratorInterface<E extends Comparable> {

    /**
     *
     */
    public void reset();

    /**
     *
     * @return
     */
    public E getNext();

    /**
     *
     * @return
     */
    public boolean hasNext();
}
