
    import java.util.Stack;  //COde by chatgpt

public class Q2 {
    public static String simplifyPath(String path) {
        String[] directories = path.split("/");
        Stack<String> stack = new Stack<>();

        for (String dir : directories) {
            if (dir.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!dir.equals(".") && !dir.isEmpty()) {
                stack.push(dir);
            }
        }

        StringBuilder result = new StringBuilder("/");
        for (String dir : stack) {
            result.append(dir).append("/");
        }

        if (result.length() > 1) {
            result.setLength(result.length() - 1); // Remove trailing slash
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String absolutePath = "/apnacollege/..";
        String simplifiedPath = simplifyPath(absolutePath);
        System.out.println("Simplified Path: " + simplifiedPath);
    }
}

    

