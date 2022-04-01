package com.neu.aed.assignment4;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentQueue<Integer> queue = new ConcurrentQueue<>();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 500; i++) {
                    queue.add(i);
                    queue.add(i);
                    queue.remove();
                    queue.peek();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 500; i++){
                    queue.add(i);
                    queue.add(i);
                    queue.remove();
                    queue.peek();
                }
            }
        });

        thread1.start();
        thread2.start();

        // each thread adds two elements and remove 1 element - net 1 element added
        // after some time there should be 1000 ( 500 from each thread) elements in queue
        Thread.sleep(10000);
        System.out.println("size of queue = " + queue.size()); // to get queue size
    }
}
