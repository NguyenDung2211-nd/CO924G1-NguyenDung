package ss11_dsa_stack_queue.bai_tap.kiem_tra_chuoi_palindrome_su_dung_queue;


public class Main{
    public static void main(String[] args) {
        String string = "Able was I ere I saw Elba";
        boolean result = Palindrome.isPalindrome(string);
        if (result) {
            System.out.println(string + " is a palindrome");
        } else {
            System.out.println(string + " is not a palindrome");
        }
    }
}
