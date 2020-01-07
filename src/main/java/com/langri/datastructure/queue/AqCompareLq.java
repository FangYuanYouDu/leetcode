package com.langri.datastructure.queue;

import java.util.Random;

/**
 * @author LR
 * @version 1.0.0
 * @date 2020/1/7 20:05
 */
public class AqCompareLq {

    private static double testQueue(Queue<Integer> queue,int opCount){
        long startTime = System.nanoTime();

        Random random = new Random();
        for (int i = 0; i < opCount; i++) {
            queue.enqueue(random.nextInt(Integer.MAX_VALUE));
        }
        for (int i = 0; i < opCount; i++) {
            queue.dequeue();
        }

        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000000.0;
    }

    public static void main(String[] args) {
        //10W就行 慎用100W N²的复杂度不是闹着玩的
        int opCount = 100000000;

//        ArrayQueue<Integer> arrayQueue = new ArrayQueue<Integer>();
//        double time1 = testQueue(arrayQueue, opCount);
//        System.out.println("arrayQueue_time: "+time1+" s");

        LoopQueue<Integer> loopQueue = new LoopQueue<Integer>();
        double time2 = testQueue(loopQueue, opCount);
        System.out.println("loopQueue_time: "+time2+" s");
    }
}
