public class palindromeCheck {

    public static void main(String[] args) {
        String test = "radar";
        String test2 = "aradar";

        System.out.println(palindromeChecker1(test));
        System.out.println(palindromeChecker1(test2));

        System.out.println(palindromeChecker2(test));
        System.out.println(palindromeChecker2(test2));

    }

    public static boolean palindromeChecker1(String test) {
        int left = 0;
        int right = test.length() - 1;

        while (left < right) {
            if (test.charAt(right) != test.charAt(left)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean palindromeChecker2(String test) {
        StringBuffer testBuffer = new StringBuffer(test);
        testBuffer.reverse();
        return testBuffer.toString().equals(test) ? true : false;
    }
}
