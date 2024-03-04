public class Q4 {
    public static int SameChar(String str, int i, int count) {
        if (i == str.length()) {
            return count;
        }
        for (int j = i; j < str.length(); j++) {
            if (str.charAt(i) == str.charAt(j)) {
                count++;

            }

        }
        return SameChar(str, i + 1, count);
    }

    public static void main(String arg[]) {
        String S = "aba";
        String s = new String(" ");
        System.out.print(SameChar(S, 0, 0));
    }

}
