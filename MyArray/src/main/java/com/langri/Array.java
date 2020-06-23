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

    /**
     * 向第一个位置添加元素
     * @param e 要添加的元素
     */
    public void addFirst(int e){
        add(0, e);
    }

    /**
     * 向最后的位置添加元素
     * @param e 要添加的元素
     */
    public void addLast(int e){
        /*if(size == data.length){
            throw new IllegalArgumentException("addLast fail. array is full");
        }
        data[size] = e;
        size++;*/
        add(size, e);
    }

    /**
     * 添加元素到指定位置
     * @param index 指定位置
     * @param e 要添加的元素
     */
    public void add(int index,int e){
        if(size == data.length){
            throw new IllegalArgumentException("add fail. array is full");
        }

        if(index < 0 || index > size){
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

    /**
     *
     * @return 重写toString方法
     */
    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        result.append(String.format("Array: size= %d , capacity= %d \n",size,data.length));
        result.append('[');
        for(int i=0; i<size; i++){
            result.append(data[i]);
            if(i != size-1){
                result.append(", ");
            }
        }
        result.append(']');
        return result.toString();
    }

    /**
     * 获取指定位置的元素
     * @param index 指定位置
     * @return 返回元素
     */
    public int get(int index){
        if(index <0 || index >=size){
            throw new IllegalArgumentException("get fail. index is illegal");
        }

        return data[index];
    }

    /**
     * 改变指定位置的元素的值
     * @param index 指定位置
     * @param e 新的值
     */
    public void set(int index, int e){
        if(index <0 || index >=size){
            throw new IllegalArgumentException("get fail. index is illegal");
        }

        data[index] = e;
    }

    /**
     * 判断数组中是否包含 参数元素
     * @param e 参数元素
     * @return 返回是/否
     */
    public boolean contains(int e){
        for(int i=0; i<size; i++){
            if(data[i] == e){
                return true;
            }
        }
        return false;
    }

    /**
     * 查找指定元素的索引
     * @param e 指定元素
     * @return 如果存在该元素，返回该元素的索引值；否则，返回无效索引值-1
     */
    public int findIndex(int e){
        for(int i=0; i<size; i++){
            if(data[i] == e){
                return i;
            }
        }
        return -1;
    }

    /**
     * 删除指定位置的元素
     * @param index 索引值
     * @return 返回被删除元素的值
     */
    public int remove(int index){
        if(index <0 || index >=size){
            throw new IllegalArgumentException("remove fail. index is illegal");
        }

        int ret = data[index];
        for(int i=index; i<size-1; i++){
            data[i] = data[i+1];
        }
        size--;

        return ret;
    }

    /**
     * 删除第一个索引位置的元素
     * @return 返回被删除元素的值
     */
    public int removeFirst(){
        return remove(0);
    }

    /**
     * 删除最后一个索引位置的元素
     * @return 返回被删除元素的值
     */
    public int removeLast(){
        return remove(size-1);
    }

    /**
     * 删除指定元素e (数组中只存在一个元素e 有效)
     * @param e 指定元素e
     * @return 返回是否删除成功
     */
    public boolean removeElement(int e){
        int index = findIndex(e);
        if(index != -1){
            remove(index);
            return true;
        }
        return false;
    }

    //TODO 删除多个指定元素e

}
