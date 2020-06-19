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
}
