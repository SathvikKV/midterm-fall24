package org.example;

import java.util.Collections;
import java.util.LinkedList;


public class MyCircularQueue {

    int k = 0;
    int front = 0;
    int rear = 0;

    LinkedList<Integer> q = new LinkedList<>();



    public MyCircularQueue(int k) {
        this.k =k;
        for(int i = 0; i<k;i++){
            q.add(i);
        }


    }

    public boolean enQueue(int value) {


        if(q.isEmpty()) return -1;

        q.offer(value);
        int temp = 0;
        front = temp;
        rear = front;
        return true;

    }


    public boolean deQueue() {

        if(q.isEmpty()){
            return -1;
        }
        q.remove(0);
        int temp = 0;
        front = temp;
        rear = front;
        return true;



    }

    public int Front() {

        return front;
    }

    public int Rear() {

        return rear;
    }

    public boolean isEmpty() {

        return q.isEmpty();
    }

    public boolean isFull() {

        return q.size() == k;
    }
}
