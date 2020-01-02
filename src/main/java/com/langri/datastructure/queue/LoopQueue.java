package com.langri.datastructure.queue;

import org.omg.CORBA.Object;

/**
 * @author LR
 * @version 1.0.0
 * @date 2019/12/29 15:55
 */
public class LoopQueue<E> implements Queue<E> {
    private E[] data;
    private int front;
    private int tail;
    private int size;

    public LoopQueue(int capacity){
        data = (E[])new Object[capacity - 1];
        front = 0;
        tail = 0;
        size = 0;
    }

    public LoopQueue(){
        this(10);
    }

    public boolean isEmpty(){
        return front == tail;
    }

    public int getCapacity(){
        return data.length -1;
    }

    public int getSize(){
        return size;
    }

    public E getFront() {
        return null;
    }


    public void enqueue(E e) {

    }

    public E dequeue() {
        return null;
    }

}
