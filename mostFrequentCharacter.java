import java.util.HashMap;
import java.util.Map;

public class mostFrequentCharacter {
    public static void main(String[] args) {
        String str = "motsttttrrrrrfrequtrtenrtt";
        System.out.println((findMostFrequentCharacter(str)));

    }

    public static char findMostFrequentCharacter(String test) {
        Map<Character, Integer> hashMapperString = new HashMap<>();

        for (char s : test.toCharArray()) {
            hashMapperString.put(s, hashMapperString.getOrDefault(s, 0) + 1);
        }

        char mostFrequentChar = '\0';
        int maxFrequency = 0;

        for (Map.Entry<Character, Integer> testEntry : hashMapperString.entrySet()) {
            char s = testEntry.getKey();
            int frequency = testEntry.getValue();

            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mostFrequentChar = s;
            }
        }

        return mostFrequentChar;
    }
}
