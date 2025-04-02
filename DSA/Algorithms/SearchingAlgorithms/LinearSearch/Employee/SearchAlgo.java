package com.kodnest.DSA.Algorithms.SearchingAlgorithms.LinearSearch.Employee;

public class SearchAlgo {
    public int linear(Employee empArray[], String key) {
        for (int i = 0; i < empArray.length; i++) {
            if (key.equals(empArray[i].name)) {
                return i;
            }
        }
        return -1;
    }
}
