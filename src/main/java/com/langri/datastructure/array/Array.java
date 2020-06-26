package com.langri.datastructure.array;

/**
 * @author LR
 * @version 1.0.0
 * @date 2019/12/7 3:45
 */
public class Array<E> {
    private E[] data; //数组
    private int size; //元素中的个数

    //==== capacity 容量 ====//

    //传入数组长度，构建数组
    public Array(int capacity) {
        data = (E[]) new Object[capacity];
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
    public void addLast(E e) {
        /*if(size == data.length) {
            throw new IllegalArgumentException("addLast failed. the size is already full ");
        }
        data[size] = e;
        size++;
        约等于 add(size,e);
        */
        add(size, e);
    }

    public void addFirst(E e) {
        add(0, e);
    }

    /**
     *
     * @param index 要插入数据的位置
     * @param insertValue 要插入的数据
     */
     public void add(int index, E insertValue) {

         if(index < 0 || index > size) {
             throw new IllegalArgumentException("add failed. require index < 0 || index > size");
         }

         if(size == data.length) {
             resize(2*data.length);
         }

         for (int i = size-1; i >= index; i--) {
             data[i+1] = data[i];
         }

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
    public E get(int index){
         //还要判断传入索引的合法性
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("get failed. the index is Illegal");
        }

         return data[index];
    }

    //修改某个位置的元素
    public void set(int index,E e){
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
    public boolean existElement(E e){
        for (int i = 0; i < size; i++) {
            //==是地址引用比较
            //.equals()是值比较
            if(data[i].equals(e)){
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
    public int indexOfElement(E e){
        for (int i = 0; i < size; i++) {
            if(data[i].equals(e)){
                return i;
            }
        }
        return -1;
    }

    //从数组中删除某个元素
    //1 2 3 4 5 6
    //1 3 4 5 6
    public E remove(int index){
        //还要判断传入索引的合法性
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("delete failed. the index is Illegal");
        }

        E delValue = data[index];

        for (int i = index+1; i < size; i++) {
            data[i-1] = data[i];
        }
        size--;
        data[size] = null; //loitering object 闲散对象

        //如果元素个数等于容量的一半，开始进行缩容
        if(size == data.length/4 && data.length/2 != 0){
            resize(data.length/2);
        }

        // Lazy模式：当数组n容量满时，扩容一倍2n；当数组2n容量删除元素到1/4(也就是到n/2)时，缩容到n即可
        // 防止震荡复杂度（防止有时刚添加一个元素扩容一倍，就又删除一个元素缩容到原来容量，如此循环往复，复杂度一直是O(n)）
        //本来remove()的复杂度可以看作是O(1) 均摊复杂度也是O(1) 只有扩容/缩容的时候才是O(n) 震荡的时候就完全变成O(n)了
        /*if(size == data.length / 4){
            resize(data.length / 2);
        }*/
        return delValue;
    }

    //删除第一个元素
    public E removeFist(){
        return remove(0);
    }

    //删除最后一个元素
    public E removeLast(){
        return remove(size-1);
    }

    //删除元素
    public boolean removeElement(E e){
        int index = indexOfElement(e);
        if(index != -1){
            remove(index);
            return true;
        }
        throw new IllegalArgumentException("delete failed. the index is Illegal");
    }
    //删除所有符合的元素

    private void resize(int capacity){
        E[] newData = (E[])new Object[capacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }
}