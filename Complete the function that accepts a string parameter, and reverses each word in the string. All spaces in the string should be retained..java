// Complete the function that accepts a string parameter, and reverses each word in the string. All spaces in the string should be retained.

// Examples
// "This is an example!" ==> "sihT si na !elpmaxe"
// "double  spaces"      ==> "elbuod  secaps"


public class Kata {
    public static String reverseWords(final String original) {
        char[] characters = original.toCharArray();
        int start = 0;

        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == ' ' || i == characters.length - 1) {
                int end = i == characters.length - 1 ? i : i - 1;

                while (start < end) {
                    char temp = characters[start];
                    characters[start] = characters[end];
                    characters[end] = temp;
                    start++;
                    end--;
                }

                start = i + 1;
            }
        }

        return new String(characters);
    }
  }
