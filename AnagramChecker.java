import java.util.Arrays;

public class AnagramChecker {

    private static boolean isAnagram(String first, String second) {
        // if lengths differ, they can't be anagrams
        if (first.length() != second.length()) return false;

        // set size to 128 for ascii chars too
        // if we want it to be just for a-z,
        // we can set it to 26
        int[] count = new int[128];

        // here we count character freqs
        for (int i = 0; i < first.length(); i++) {
            count[first.charAt(i)]++;
            count[second.charAt(i)]--;
        }

        // if it's anagram, the count becomes zero
        for (int c : count) {
            if (c != 0) return false;
        }

        return true;
    }

    // additionally we can even use java methods
    private static boolean isAnagramJava(String first, String second) {
        if (first.length() != second.length()) return false;

        // first we break down the chars
        // into array
        char[] arr1 = first.toCharArray();
        char[] arr2 = second.toCharArray();

        // then we sort them
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // then we check if the sorted arrays
        // are equal
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent")); // true
        System.out.println(isAnagram("rat", "car")); // false
        System.out.println(isAnagramJava("listen", "silent")); // true
        System.out.println(isAnagramJava("rat", "car")); // false

    }
}
