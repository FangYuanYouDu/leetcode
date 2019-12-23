package com.langri.datastructure.stack;

/**
 * @author LR
 * @version 1.0.0
 * @date 2019/12/22 18:34
 */
public class ArrayStack<E> implements Stack<E> {
    Array<E> array;

    public ArrayStack(int capacity) {
        array = new Array<E>(capacity);
    }

    public ArrayStack() {
        array = new Array<E>();
    }

    public int getCapacity(){
        return array.getCapacity();
    }

    public int getSize() {
        return array.getSize();
    }

    public boolean isEmpty() {
        return array.isEmpty();
    }

    public void push(E e) {
        array.addLast(e);
    }

    public E poop() {
        return array.removeLast();
    }

    /**
     * 查看栈顶
     * @return e
     */
    public E peek() {
        return array.getLast();
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("[ ");
        for (int i = 0; i < array.getSize(); i++) {
            res.append(array.get(i));
            if(i != array.getSize()-1){
                res.append(", ");
            }
        }
        res.append(" ] top");
        return res.toString();
    }
}
