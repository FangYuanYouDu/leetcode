package com.langri.datastructure.queue;

/**
 * @author LR
 * @version 1.0.0
 * @date 2019/12/28 16:45
 */
public interface Queue<E> {
    //查看第一个元素
    E getFront();

    //入队
    void enqueue(E e);

    //出队
    E dequeue();

    //获取数据个数
    int getSize();

    //是否为空
    boolean isEmpty();
}
