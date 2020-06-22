package com.langri;

/**
 * @author FangYuan
 * 2020/6/19 15:28
 * @version 1.0.0
 * 创造一个数组
 */
public class Array {
    private int[] data;
    private int size;

    /**
     * 创建一个构造函数
     * @param capacity 用户传入要用多大容量的数组
     */
    public Array(int capacity){
        data = new int[capacity];
        size = 0;
    }

    /**
     * 用户如果不传入参数 默认容量为10
     */
    public Array(){
        this(10);
    }

    /**
     * 获取数组长度
     * @return 数组的长度 size
     */
    public int getSize(){
        return size;
    }

    /**
     * 获取数组容量
     * @return 数组容量 data.length == capacity
     */
    public int getCapacity(){
        return data.length;
    }

    /**
     * 数组是否位空
     * @return 判断size是否等于0
     */
    public boolean isEmpty(){
        return size == 0;
    }

    public void addFirst(int e){
        add(0, e);
    }

    public void addLast(int e){
        /*if(size == data.length){
            throw new IllegalArgumentException("addLast fail. array is full");
        }
        data[size] = e;
        size++;*/
        add(size, e);
    }
    public void add(int index,int e){
        if(size == data.length){
            throw new IllegalArgumentException("add fail. array is full");
        }

        if(index > 0 || index > size){
            throw new IllegalArgumentException("add fail. index is illegal with index > 0 || index > size");
        }

        /*for (int i = size; i > index; i--){
            data[i] = data[i-1];
        }*/
        for(int i = size-1; i >= index; i--){
            data[i+1] = data[i];
        }
        data[index] = e;
        size ++;//等效于 size = size + 1;
    }
}
