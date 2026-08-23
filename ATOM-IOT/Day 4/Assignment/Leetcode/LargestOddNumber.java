public class LargestOddNumber {
    public static void main(String[] args) {
        String num = "35427";
        String result = "";

        for (int i = num.length() - 1; i >= 0; i--) {
            if (num.charAt(i) % 2 == 1) {
                result = num.substring(0, i + 1);
                break;
            }
        }

        System.out.println(result);
    }
}