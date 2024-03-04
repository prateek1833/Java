import java.util.Stack;   //generated by chatgpt

public class Q3 {

    public static String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int num = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            } else if (c == '[') {
                numStack.push(num);
                strStack.push(currentString.toString());
                num = 0;
                currentString = new StringBuilder();
            } else if (c == ']') {
                StringBuilder temp = new StringBuilder(strStack.pop());
                int repeatTimes = numStack.pop();
                for (int i = 0; i < repeatTimes; i++) {
                    temp.append(currentString);
                }
                currentString = temp;
            } else {
                currentString.append(c);
            }
        }

        return currentString.toString();
    }

    public static void main(String[] args) {
        String input1 = "2[cv]";
        String input2 = "3[b2[v]]L";

        String output1 = decodeString(input1);
        String output2 = decodeString(input2);

        System.out.println("Sample Output 1: " + output1);
        System.out.println("Sample Output 2: " + output2);
    }
}
