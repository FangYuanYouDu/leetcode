package com.langri;

import java.util.ArrayList;

/**
 * @author FangYuan
 * 2020/6/19 16:11
 * @version 1.0.0
 */
public class Main {
    public static void main(String[] args) {
        Array array = new Array(10);
        for (int i=1; i<10; i++){
            array.addLast(i);
        }
        System.out.println(array.toString());

        array.remove(1);
        System.out.println(array);
    }
}
