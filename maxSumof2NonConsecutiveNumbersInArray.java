import java.util.Arrays;

public class maxSumof2NonConsecutiveNumbersInArray {

    public static void main(String[] args) {
        int[] array = {2, -1, 3, -4, 5, -2, 1};
        int maxSubarray = maxSumof2NonConsecutiveNumbersInArray(array);
        System.out.println("Maksimum Alt Dizi: " + maxSubarray);

    }

    public static int maxSumof2NonConsecutiveNumbersInArray(int[] array) {
        int currentSum = 0;
        int maxSum = 0;
        if (array.length == 0) {
            return 0;
        }
        if (array.length == 1) {
            return array[0];
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (Math.abs(array[j] - array[i]) > 1) {
                    currentSum = array[i] + array[j];
                    if (currentSum > maxSum) {
                        maxSum = currentSum;
                    }
                }
            }
        }
        return maxSum;
    }
}

