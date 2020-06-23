package com.langri.datastructure.array;

/**
 * @author LR
 * @version 1.0.0
 * @date 2019/12/8 18:35
 */
public class Main {
    public static void main(String[] args) {
        int[][] scores = new int[][]{{100,95,90},{10,20,30}};

        /*for (int i=0; i<scores.length; i++){
            System.out.println(scores[i]);
        }*/

        for (int score[]: scores) {
            for (int score1: score) {
                System.out.println(score1);
            }
        }
    }
}