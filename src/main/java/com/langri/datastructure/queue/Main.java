package com.langri.datastructure.queue;

/**
 * @author LR
 * @version 1.0.0
 * @date 2019/12/28 17:15
 */
public class Main {
    public static void main(String[] args) {
        ArrayQueue<String> arrayQueue = new ArrayQueue<String>();
        arrayQueue.enqueue("张三");
        arrayQueue.enqueue("李四");
        arrayQueue.enqueue("王五");
        arrayQueue.enqueue("张二麻子");

        System.out.println(arrayQueue.toString());

        arrayQueue.enqueue("silly");

        System.out.println(arrayQueue.toString());

        arrayQueue.dequeue();
        int capacity = arrayQueue.getCapacity();
        int size = arrayQueue.getSize();

        System.out.println("capacity:"+capacity+"____"+"size:"+size);

        System.out.println(arrayQueue.toString());
    }
}
