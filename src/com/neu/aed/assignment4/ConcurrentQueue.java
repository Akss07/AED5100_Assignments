package com.neu.aed.assignment4;

import java.util.LinkedList;
import java.util.Queue;

public class ConcurrentQueue<E> {
    Queue<E> queue;
    Object objectLock = new Object();
    public ConcurrentQueue(){
        queue = new LinkedList<E>();
    }

    public void add(E data) {
        synchronized (objectLock){
            queue.add(data);
        }
    }

    public E remove(){
        synchronized (objectLock){
            if(!isEmpty()){
                return queue.remove();
            }
        }
        return null;
    }

    public E peek(){
        synchronized (objectLock){
            if(!queue.isEmpty()){
                return queue.peek();
            }else{
                return null;
            }
        }
    }

    public boolean isEmpty(){
        if(queue.size() == 0){
            return true;
        }else{
            return false;
        }
    }

    /**
     * This function is for testing purpose
     * @return queue size
     */
    public int size(){
        return queue.size();
    }
}
