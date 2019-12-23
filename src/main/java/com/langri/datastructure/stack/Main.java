package com.langri.datastructure.stack;

/**
 * @author LR
 * @version 1.0.0
 * @date 2019/12/22 14:04
 */
public class Main {
    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<Integer>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
            System.out.println(stack.toString());
        }
        stack.poop();
        System.out.println(stack.toString());
    }
}
