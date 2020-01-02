package com.langri.datastructure.queue;

/**
 * @author LR
 * @version 1.0.0
 * @date 2019/12/28 16:45
 */
public class ArrayQueue<E> implements Queue<E> {
    Array<E> array;

    public ArrayQueue() {
        array = new Array<E>();
    }

    public ArrayQueue(int capacity) {
        array = new Array<E>(capacity);
    }

    public E getFront() {
        return array.getFirst();
    }

    public void enqueue(E e) {
        array.addLast(e);
    }

    public E dequeue() {
        return array.removeFist();
    }

    public int getSize() {
        return array.getSize();
    }

    public boolean isEmpty() {
        return array.isEmpty();
    }

    public int getCapacity(){
        return array.getCapacity();
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("Queue:");
        res.append(" front [");
        for (int i = 0; i < array.getSize(); i++) {
            res.append(array.get(i));
            if(i != array.getSize()-1){
                res.append(", ");
            }
        }
        res.append("] tail");
        return res.toString();
    }
}
