public class toUppercase {
    public static String toupper(String s) {
        StringBuilder sb = new StringBuilder(" ");
        sb.append(Character.toUpperCase(s.charAt(0)));
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                sb.append(s.charAt(i));
                i++;
                sb.append(Character.toUpperCase(s.charAt(i)));
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();

    }

    public static void main(String arg[]) {
        String s = "amarendra bahubali yani mai";
        System.out.print(toupper(s));
    }

}
