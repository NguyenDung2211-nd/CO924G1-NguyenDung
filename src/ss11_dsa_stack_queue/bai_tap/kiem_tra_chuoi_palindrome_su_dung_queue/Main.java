package ss11_dsa_stack_queue.bai_tap.kiem_tra_chuoi_palindrome_su_dung_queue;

import static ss11_dsa_stack_queue.bai_tap.kiem_tra_chuoi_palindrome_su_dung_queue.PalindromeChecker.isPalindrome;

public class Main{
public static void main(String[] args) {
    String str1 = "Able was I ere I saw Elba";
    String str2 = "Hello World";

    System.out.println("\"" + str1 + "\" là Palindrome? " + isPalindrome(str1));
    System.out.println("\"" + str2 + "\" là Palindrome? " + isPalindrome(str2));
}
}
