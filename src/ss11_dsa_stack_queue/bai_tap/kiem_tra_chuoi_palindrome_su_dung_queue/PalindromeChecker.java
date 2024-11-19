package ss11_dsa_stack_queue.bai_tap.kiem_tra_chuoi_palindrome_su_dung_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z]", "").toLowerCase();

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            queue.add(ch);
            stack.push(ch);
        }

        while (!queue.isEmpty()) {
            if (queue.poll() != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}
