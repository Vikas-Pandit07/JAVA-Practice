package com.kodnest.DSA.Project;

public class Array {
    private int[] arr;
    private int size;
    public Array(int size) {
        if (size > 0) {
            this.size = size;
            arr = new int[size];
            System.out.println("Array of length "+size+" created.");
        }
        else {
            System.out.println("give valid length any number > than 0.");
        }
    }

    public void insert(int index, int element) {
        if (index >= 0 && index <= arr.length - 1) {
            arr[index] = element;
            System.out.println("ELEMENT " +element+ " IS INSERTED AT INDEX "+index);
        }
        else {
            System.out.println("GIVE VALID INDEX FROM 0 TO "+(size - 1));
        }
    }

    public void delete(int index) {
        if (index >= 0 && index <= arr.length - 1) {
            System.out.println("ELEMENT " +arr[index]+ " IS DELETED");
            arr[index] = 0;
        }
        else {
            System.out.println("GIVE VALID INDEX FROM 0 TO "+(size - 1));
        }
    }

    public void display() {
        System.out.print("[ ");
        for (int i = 0; i< arr.length; i++) {
            if (i != arr.length - 1)
                System.out.print(arr[i]+", ");
            else
                System.out.println(arr[i]+" ]");
        }
        System.out.println();
    }
    int length() {
        return arr.length;
    }
}
