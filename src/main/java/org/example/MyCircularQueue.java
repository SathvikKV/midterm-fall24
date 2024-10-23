package org.example;

import java.util.Collections;
import java.util.LinkedList;


public class MyCircularQueue {

    public int[] queue;
    public int front;
    public int rear;
    public int size =0;









    public MyCircularQueue(int k) {

        queue = new int[k];
        front = -1;
        rear = -1;
        size =0;



    }

    public boolean enQueue(int value) {


        if(queue.isEmpty()) return false;

        queue.offer(value);
        rear = queue.indexOf(value);
        int temp = 0;
        front = temp;
        rear = front;
        return true;

    }


    public boolean deQueue() {

        if(queue.isEmpty()){
            return false;
        }
        queue.remove(0);
        rear = queue.lastIndexOf(rear);

        int temp = 0;
        front = temp;
        rear = front;
        return true;



    }

    public int Front() {

        return queue[front];
    }

    public int Rear() {

        return queue[rear];
    }

    public boolean isEmpty() {

        return size ==0;
    }

    public boolean isFull() {

        return size == k;
    }
}
