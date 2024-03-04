public class BinaryString {
    public static void Binary(String str, int idx, StringBuilder sb, char a) {
        if (idx == str.length()) {
            System.out.print(sb.toString());
            return;
        }
        if (str.charAt(idx) == a) {
             Binary(str, idx + 1, sb, a);
        } else {
             Binary(str, idx + 1, sb.append(str.charAt(idx)), str.charAt(idx));
        }
    }

    public static void main(String[] args) {
        String str = "10000101000111011";
        StringBuilder sb = new StringBuilder(str.charAt(0));
        Binary(str, 0, sb, str.charAt(0));

    }

}
