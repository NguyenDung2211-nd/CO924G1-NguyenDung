package ss11_dsa_stack_queue.bai_tap.kiem_tra_chuoi_palindrome_su_dung_queue;

import java.util.LinkedList;
import java.util.Queue;

public class Palindrome {
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        Queue<Character> queue = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            queue.add(str.charAt(i));
        }

        int end = str.length() - 1;

        while (!queue.isEmpty()) {
            char frontChar = queue.poll();
            char endChar = str.charAt(end);

            if (frontChar != endChar) {
                return false;
            }

            end--;
        }
        return true;
    }
}


