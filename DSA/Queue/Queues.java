package com.kodnest.DSA.Queue;

public class Queues {
    private int q[];
    private int f = -1;
    private int r = -1;
    private int size;

    public Queues(int size) {
        this.size = size;
        q = new int[size];
        System.out.println("Queue of size "+size+ " is created.");
    }

    public void insert(int element) {
        if (r == size - 1) {
            System.out.println("QUeue is full element cannot be inserted");
        }
        else {
            ++r;
            q[r] = element;
            System.out.println("Element "+element+ " inserted into the queue.");
        }
    }

    public void delete() {
        if ((f == -1 && r == -1) || f == size - 1) {
            System.out.println("Queue is empty element cannot be deleted.");
        }
        else {
            f++;
            System.out.println("Element deleted is "+q[f]);
            q[f] = 0;
        }
    }

    public void display() {
        if ((f == -1 && r == -1) || f == size - 1) {
            System.out.println("Queue is empty element cannot be display.");
        }
        else {
            for (int i = f + 1; i <= r; i++) {
                System.out.print(q[i] + " ");
            }
        }
        System.out.println();
    }
}
