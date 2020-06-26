package com.langri;

/**
 * @author FangYuan
 * 2020/6/19 16:11
 * @version 1.0.0
 */
public class Main {
    public static void main(String[] args) {
        Array<String> array = new Array<String>(10);
        for (int i=1; i<10; i++){
            array.addLast(i+".");
        }
        System.out.println(array.toString());

        array.addFirst("zzz");
        array.addLast("aaa");
        System.out.println(array);
    }
}
