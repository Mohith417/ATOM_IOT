import java.util.*;

class Question4 {

    public static void main(String[] args) {

        TreeSet<String> set = new TreeSet<>();

        set.add("10");
        set.add("2");
        set.add("1");
        set.add("20");
        set.add("11");

        System.out.println(set);
        System.out.println(set.first());
        System.out.println(set.last());
    }
}

// OUTPUT
// [1, 10, 11, 2, 20]
// 1
// 20