import java.util.Arrays;

public class anagramCheck {

    public static void main(String[] args) {

        String test = "listen";
        String test2 = "silent";
        String test3 = "silent2";
        System.out.println("test 1 anagram test 2 result : " + anagramChecker(test, test2));
        System.out.println("test 1 anagram test 3 result : " + anagramChecker(test, test3));


    }

    public static boolean anagramChecker(String tester1, String tester2) {
        if (tester1.length() != tester2.length()) {
            return false;
        }

        char[] tester1Char = tester1.toCharArray();
        char[] tester2Char = tester2.toCharArray();
        Arrays.sort(tester1Char);
        Arrays.sort(tester2Char);


        return Arrays.equals(tester1Char, tester2Char);
    }
}
