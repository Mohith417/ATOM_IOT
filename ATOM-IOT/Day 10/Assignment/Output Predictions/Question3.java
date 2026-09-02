import java.util.*;

class Question3 {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "A");
        map.put(2, "B");
        map.put(1, "C");

        System.out.println(map.size());
        System.out.println(map.get(1));
        System.out.println(map);
    }
}

// OUTPUT
// 2
// C
// {1=C, 2=B}
//
// NOTE:
// HashMap does not guarantee order of entries.