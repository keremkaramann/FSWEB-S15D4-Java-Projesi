import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueusChallange {
    public static void main(String[] args) {
        String[] examples = {"I did, did I?", "Racecar", "hello", "Was it a car or a cat I saw ?"};

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for (String example : examples) {
            String cleanExample = example.toLowerCase().replaceAll("[.,!?\"]", "");
            for (char ch : cleanExample.toCharArray()) {
                stack.push(ch);
                queue.add(ch);
            }

            boolean isPalindrome = true;
            while (!stack.isEmpty() && !queue.isEmpty()) {
                if (!stack.pop().equals(queue.poll())) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) {
                System.out.println("\"" + example + "\" is a palindrome.");
            } else {
                System.out.println("\"" + example + "\" is not a palindrome.");
            }

        }
    }
}
