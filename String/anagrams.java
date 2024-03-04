import java.util.Arrays;

public class anagrams {
    public static Boolean anagrams(String s1, String s2) {
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();
        if (ch1.length == ch2.length) {
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            if (Arrays.equals(ch1, ch2)) {
                return true;
            } 
        }
        return false;
    }

    public static void main(String arg[]) {
        String a = "care";
        String b = "race";
        System.out.print(anagrams(a, b));
    }
}
