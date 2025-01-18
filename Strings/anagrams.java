import java.util.Arrays;

public class anagrams {
    public static boolean isAnagram(String s, String t) {
        boolean bool = false;
        s=s.toLowerCase();
        t=t.toLowerCase();
        if(s.length()==t.length()){
            char[] schar=s.toCharArray();
            char[] tchar=t.toCharArray();
            Arrays.sort(schar);
            Arrays.sort(tchar);
            if(Arrays.equals(schar, tchar)){
                bool=true;
            }
        }
        return bool;
    }

    public static void main(String[] args) {
        String str1="race";
        String str2="care";
        boolean result = isAnagram(str1,str2);
        System.out.print(result);
    }
    
}
