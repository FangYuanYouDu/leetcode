package com.langri.datastructure;

/**
 * @author fy
 * @version 1.0.0
 * @date 2019/12/7 3:45
 */
public class Array {
    private int[] data; //数组
    private int size; //元素中的个数

    //==== capacity 容量 ====//

    //传入数组长度，构建数组
    public Array(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    //无参构造数组，默认长度为10
    public Array(){
        this(10);
    }

    //获取数组长度
    public int getCapacity(){
        return data.length;
    }

    //获取数组中数据的长度
    public int getSize(){
        return size;
    }

    //是否位空
    public boolean isEmpty(){
        return size==0;
    }

    //添加元素
    public void addLast(int e) {
        /*if(size == data.length) {
            throw new IllegalArgumentException("addLast failed. the size is already full ");
        }
        data[size] = e;
        size++;
        约等于 add(size,e);
        */
        add(size, e);
    }

    public void addFirst(int e) {
        add(0, e);
    }

    /**
     *
     * @param index 要插入数据的位置
     * @param insertValue 要插入的数据
     */
     public void add(int index, int insertValue) {
         if(size == data.length) {
             throw new IllegalArgumentException("add failed. the size is already full");
         }

         if(index < 0 || index > size) {
             throw new IllegalArgumentException("add failed. require index < 0 || index > size");
         }

         /*
          * @param      data     the source array.源数组
          * @param      index    starting position in the source array.源数组中的起始位置
          * @param      data     the destination array.目标数组
          * @param      destPos  starting position in the destination data.目标数据中的起始位置
          * @param      length   the number of array elements to be copied.要复制的数组元素数量
                            //1                   //2       //10-1=9
         System.arraycopy(data, index, data, index + 1, size - index);
          */

         for (int i = size-1; i >= index; i--) {
             data[i+1] = data[i];
         }
        //66 88 99 100  77插入第二个位置
         //66 88 88 99 100 capacity到index位置的数据 向后移1位
         // capacity == size-1
         //66 77 88 99 100 77将原本在第二位置的88覆盖
        data[index] = insertValue;
        size++;
     }

     //输出数组的长度 元素个数
    @Override 
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append(String.format("array: size = %d , capacity = %d\n", size , data.length));
        res.append("[");
        for (int i = 0; i <size ; i++) {
            res.append(data[i]);
            if(i != size-1){
                res.append(", ");
            }
        }
        res.append("]");

        return res.toString();
    }

    //获取某个位置的元素
    public int get(int index){
         //还要判断传入索引的合法性
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("get failed. the index is Illegal");
        }

         return data[index];
    }

    //修改某个位置的元素
    public void set(int index,int e){
        //还要判断传入索引的合法性
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("set failed. the index is Illegal");
        }

        data[index] = e;
    }

    /**
     * 查询数组中是否有该元素
     * @param e 要查找的元素
     * @return 是否存在
     */
    public boolean existElement(int e){
        for (int i = 0; i < size; i++) {
            if(data[i] == e){
                return true;
            }
        }
         return false;
    }

    /**
     * 查询某个元素的索引
     * @param e 要查找的元素
     * @return 返回该元素的索引，如果没有则返回约定未找到代码"-1"
     */
    public int indexOfElement(int e){
        for (int i = 0; i < size; i++) {
            if(data[i] == e){
                return i;
            }
        }
        return -1;
    }

    //从数组中删除某个元素
    //1 2 3 4 5 6
    //1 3 4 5 6
    public int remove(int index){
        //还要判断传入索引的合法性
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("delete failed. the index is Illegal");
        }

        int delValue = data[index];

        for (int i = index; i < size; i++) {
            data[i] = data[i+1];
        }
        size--;

        return delValue;
    }

    //删除第一个元素
    public int removeFist(){
        return remove(0);
    }

    //删除最后一个元素
    public int removeLast(){
        return remove(size-1);
    }

    //删除元素
    public boolean removeElement(int e){
        int index = indexOfElement(e);
        if(index != -1){
            remove(index);
            return true;
        }
        throw new IllegalArgumentException("delete failed. the index is Illegal");
    }
    //删除所有符合的元素

}