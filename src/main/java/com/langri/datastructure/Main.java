package com.langri.datastructure;

import org.omg.Messaging.SyncScopeHelper;

import java.util.Date;

/**
 * @author fy
 * @version 1.0.0
 * @date 2019/12/8 18:35
 */
public class Main {
    public static void main(String[] args) {
        Array array = new Array(20);
        for (int i = 0; i < 10 ; i++) {
            array.addLast(i);
        }

        //System.arraycopy(array, 1, array, 1 + 1, 20 - 1);

//        array.add(2,20);
//        System.out.println(array);

//        array.addFirst(-1);
//        System.out.println(array);
//        array.set(-5,5);
//        System.out.println(array);
        System.out.println(array);
        boolean b = array.removeElement(2);
        System.out.println(array);
    }
}