public class Strsubstr {
 
    public static int countSubstrs(String str, int i, int j, int n) {
        if (n == 1) {
            return 1; // Base case: A single character is always a palindromic substring
        }
        if (n <= 0) {
            return 0; // Base case: If no valid substring exists, return 0
        }

        // Recursive relation
        int res = countSubstrs(str, i + 1, j, n - 1)   // Exclude the first character
                + countSubstrs(str, i, j - 1, n - 1)   // Exclude the last character
                - countSubstrs(str, i + 1, j - 1, n - 2); // Avoid double counting

        // If characters at both ends are the same, count this substring
        if (str.charAt(i) == str.charAt(j)) {
            res++;
        }

        return res;
    }

    public static void main(String[] args) {
        String str = "aba";
        int n = str.length();
        System.out.println(countSubstrs(str, 0, n - 1, n));
    }
}
