class Solution {
    public static void main(String[] args) {
        int x = 120; // test number
        String s = Integer.toString(x);
        int l = 0, r = s.length() - 1;
        boolean isPal = true;
        while (l < r) {
            if (s.charAt(l++) != s.charAt(r--)) {
                isPal = false;
                break;
            }
        }
        System.out.println(x + (isPal ? " is palindrome" : " is not palindrome"));
    }
}
