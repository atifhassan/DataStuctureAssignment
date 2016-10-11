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
public interface QueueInterface<E> {

    /**
     *
     */
    public void Enqueue();

    /**
     *
     */
    public void Dequeue();

    /**
     *
     * @return
     */
    public boolean isEmpty();

    /**
     *
     * @return
     */
    public boolean isFull();

    /**
     *
     * @return
     */
    public int size();
}
