/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Exceptions.EmptyException;

/**
 *
 * @author Atif Hassan
 * @param <E>
 */
public interface ListInterface<E> extends InteratorInterface<E>{

    /**
     *
     * @param element
     */
    public void add(E element);

    /**
     *
     * @param element
     * @return
     * @throws EmptyException
     */
    public E remove(E element)throws EmptyException;

    /**
     *
     * @param element
     * @return
     */
    public boolean contains(E element);

    /**
     *
     * @return
     */
    public boolean isEmpty();

    /**
     *
     * @return
     */
    public int size();

    /**
     *
     * @param element
     * @return
     */
    public E get(E element);
}
