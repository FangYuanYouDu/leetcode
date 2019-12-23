package com.langri.datastructure.array;

/**
 * @author LR
 * @version 1.0.0
 * @date 2019/12/8 18:35
 */
public class Main {
    public static void main(String[] args) {
        //new ArrayList<Integer>(20);

        //由new Array(20) 到 new Array<Integer>(20);
        Array<Integer> array = new Array<Integer>();
        for (int i = 0; i < 10 ; i++) {
            array.addLast(i);
        }

        //System.arraycopy(array, 1, array, 1 + 1, 20 - 1);

        array.add(2,20);
        System.out.println(array);

//        array.addFirst(-1);
//        System.out.println(array);
//        array.set(-5,5);
//        System.out.println(array);
//        System.out.println(array);
        array.removeElement(2);
        array.removeFist();
        System.out.println(array);
    }
}