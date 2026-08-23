public class FirstLetterTwice {
    public static void main(String[] args) {
        String s = "abccbaacz";

        for (int i = 1; i < s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    System.out.println(s.charAt(i));
                    return;
                }
            }
        }
    }
}