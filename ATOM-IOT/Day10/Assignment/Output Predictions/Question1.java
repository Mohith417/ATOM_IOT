import java.util.*;

class Question1 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);

        list.remove(2);
        list.remove(Integer.valueOf(20));

        System.out.println(list);
    }
}

// OUTPUT
// [10, 20]