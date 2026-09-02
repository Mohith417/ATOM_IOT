import java.util.*;

class Question5 {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> map =
                new LinkedHashMap<>(16, 0.75f, true);

        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");

        System.out.println(map);

        map.get(1);
        map.get(2);

        System.out.println(map);

        map.put(4, "D");

        System.out.println(map);
    }
}

// OUTPUT
// {1=A, 2=B, 3=C}
// {3=C, 1=A, 2=B}
// {3=C, 1=A, 2=B, 4=D}