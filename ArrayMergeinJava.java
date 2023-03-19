import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayMergeinJava {
    public static void main(String[] args) {

        int[] firstArray = new int[]{10, 20, 30, 40};
        int[] secondArray = new int[]{50, 60, 70, 80};

        // 1.
        Object[] merged = Stream.concat(Arrays.stream(firstArray).boxed(), Arrays.stream(secondArray).boxed()).toArray();

        //2.
        IntStream.concat(IntStream.of(firstArray), IntStream.of(firstArray)).boxed().distinct().collect(Collectors.toList());


    }

}
