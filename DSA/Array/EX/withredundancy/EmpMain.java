package com.kodnest.DSA.Arrays.EX.withredundancy;

public class EmpMain {
    public static void main(String[] args) {
        Employee arr[] = new Employee[5];

        Employee e1 = new Employee();
        e1.name = "Vikas";
        e1.ssn = 700;
        e1.gender = "Male";
        e1.salary = 100000;
        arr[0] = e1;

        Employee e2 = new Employee();
        e2.name = "Vikas";
        e2.ssn = 700;
        e2.gender = "Male";
        e2.salary = 100000;
        arr[1] = e2;

        Employee e3 = new Employee();
        e3.name = "Vikas";
        e3.ssn = 700;
        e3.gender = "Male";
        e3.salary = 100000;
        arr[2] = e3;

        Employee e4 = new Employee();
        e4.name = "Vikas";
        e4.ssn = 700;
        e4.gender = "Male";
        e4.salary = 100000;
        arr[3] = e4;

        Employee e5 = new Employee();
        e5.name = "Vikas";
        e5.ssn = 700;
        e5.gender = "Male";
        e5.salary = 100000;
        arr[4] = e5;

        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i].name+ " " + arr[i].ssn+ " " + arr[i].gender+ " " + arr[i].salary);
            if (i != arr.length-1)
                System.out.println(" || ");
        }
        System.out.println("]");
    }
}
