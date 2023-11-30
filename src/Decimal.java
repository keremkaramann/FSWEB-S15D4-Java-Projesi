import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class Decimal {
    public static void main(String[] args) {
        System.out.println(decimalToBinary(5));
        System.out.println(decimalToBinary(6));
        System.out.println(decimalToBinary(13));
    }

    private static LinkedList<Integer> decimalToBinary(int num) {
        Stack<Integer> reminderStack = new Stack<>();
        LinkedList<Integer> result = new LinkedList<>();

        while (num > 0) {
            int reminder = num % 2;
            reminderStack.push(reminder);
            num = num / 2;
        }
        
        for (Integer binaryNumber : reminderStack) {
            result.push(binaryNumber);
        }
        return result;
    }
}
