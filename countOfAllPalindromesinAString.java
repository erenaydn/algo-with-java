import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class countOfAllPalindromesinAString {
    public static int palindromeCount = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String .");
        List<String> tempList = new ArrayList<>();
        String input2 = scan.nextLine();
        String input = input2.replaceAll(" ", ""); //  without no space , with space use input2
        System.out.println(input);

        // all combinations in input without " " ;
        for (int i = 1; i <= input.length(); i++) {
            for (int j = 0; j <= input.length() - i; j++) {
                tempList.add(input.substring(j, j + i));
            }
        }
        // foreach tempList and if isPalindrome true -> palindromeCount +1
        tempList.forEach(temp -> {
            boolean dene = isPalindrome(temp);
            if (dene == true) {
                palindromeCount = palindromeCount + 1;
                System.out.println("Palinderome words in String -> " + temp);
            }
        });
        System.out.println(palindromeCount);
    }

    public static boolean isPalindrome(String string) {
        // String palindrome method
        StringBuffer stringBuffer = new StringBuffer(string);
        stringBuffer.reverse();
        return string.equalsIgnoreCase(stringBuffer.toString()) ? true : false;// if doesnt matter Case like A a - a A - a a
        // return string.equals(stringBuffer.toString()) ? true : false; // case like A A - a a
    }
}