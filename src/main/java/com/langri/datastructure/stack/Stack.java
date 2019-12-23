package com.langri.datastructure.stack;

/**
 * @author LR
 * @version 1.0.0
 * @date 2019/12/22 14:05
 */
public interface Stack<E> {
    //栈内元素
    int getSize();
    //是否为空
    boolean isEmpty();
    //入栈
    void push(E e);
    //出栈
    E poop();
    //查看栈顶
    E peek();
}
