import java.util.Locale;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        System.out.println(checkForPalindrome("abccba"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Don't node"));
    }

    public static boolean checkForPalindrome(String text) {
        System.out.println("initial text: " + text);
        text = text.toLowerCase(Locale.ENGLISH).replaceAll("[.,!?\"]", "");

        Stack<Character> stackOriginal = new Stack<>();
        Stack<Character> stackTemp = new Stack<>();
        Stack<Character> stackReversed = new Stack<>();

        for (char c : text.toCharArray()) {
            stackOriginal.push(c);// h e l l o -> o, l, l, e, h
            stackTemp.push(c);// h e l l o -> o, l, l, e, h
        }

        for(char c :text.toCharArray()){
            stackReversed.push(stackTemp.pop());
        }

        System.out.println("reversed=" + stackReversed);
        System.out.println("original=" + stackOriginal);

        if (stackOriginal.equals(stackReversed)) {
            return true;
        }

        return false;
    }
}