// Your task is to make a function that can take any non-negative integer as an argument and return it with its digits in descending order. Essentially, rearrange the digits to create the highest possible number.

// Examples:
// Input: 42145 Output: 54421

// Input: 145263 Output: 654321

// Input: 123456789 Output: 987654321



import java.util.Arrays;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        // Step 1: Convert the integer to a string
        String numberString = String.valueOf(num);

        // Step 2: Convert the string to a character array
        char[] digits = numberString.toCharArray();

        // Step 3: Sort the character array in descending order
        Arrays.sort(digits);
        reverseArray(digits);

        // Step 4: Convert the sorted character array back to a string
        String sortedString = new String(digits);

        // Step 5: Parse the string to an integer and return the result
        return Integer.parseInt(sortedString);
    }

    private static void reverseArray(char[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
