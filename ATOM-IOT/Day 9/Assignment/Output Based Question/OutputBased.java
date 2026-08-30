// ==================== QUESTION 1 ====================
// Save as: Test1.java  |  Compile: javac Test1.java  |  Run: java Test1

import java.util.*;
class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                list.set(i, list.get(i) + 5);
            }
        }
        System.out.println(list);
    }
}
// OUTPUT: [15, 20, 35, 40]


// ==================== QUESTION 2 ====================
// Save as: Test2.java  |  Compile: javac Test2.java  |  Run: java Test2

import java.util.*;
class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 20 == 0) {
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}
// OUTPUT: [10, 30, 50]


// ==================== QUESTION 3 ====================
// Save as: Test3.java  |  Compile: javac Test3.java  |  Run: java Test3

import java.util.*;
class Test3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8));
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + i * 2 + 1);
        }
        System.out.println(list);
    }
}
// OUTPUT: [3, 7, 11, 15]


// ==================== QUESTION 4 ====================
// Save as: Test4.java  |  Compile: javac Test4.java  |  Run: java Test4

import java.util.*;
class Test4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 10, 15, 20));
        for (int i = 0; i < list.size(); i++) {
            int value = list.get(i);
            list.set(i, value + i * 2 - 3);
        }
        System.out.println(list);
    }
}
// OUTPUT: [2, 9, 16, 23]


// ==================== QUESTION 5 ====================
// Save as: Test5.java  |  Compile: javac Test5.java  |  Run: java Test5

import java.util.*;
class Test5 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < i; j++) {
                list.set(i, list.get(i) + list.get(j));
            }
        }
        System.out.println(list);
    }
}
// OUTPUT: [1, 3, 7]


// ==================== QUESTION 6 ====================
// Save as: Test6.java  |  Compile: javac Test6.java  |  Run: java Test6

import java.util.*;
class Test6 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 6, 9, 12, 15));
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) + i * 2 % 3 == 0) {
                list.set(i, list.get(i) + i);
            }
        }
        System.out.println(list);
    }
}
// OUTPUT: [3, 6, 9, 12, 15]